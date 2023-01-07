package com.jekis.dogglers.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jekis.dogglers.R
import com.jekis.dogglers.const.Layout
import com.jekis.dogglers.data.DataSource

class DogAdapter(private val context: Context, layout: Int) :
    RecyclerView.Adapter<DogAdapter.DogHolder>() {

    private val dataList = DataSource().loadData()

    class DogHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.tvName)
        var tvAge: TextView = view.findViewById(R.id.tvAge)
        var tvHabit: TextView = view.findViewById(R.id.tvHabit)
        var tvPic: ImageView = view.findViewById(R.id.tvPic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogHolder {
        val adapterLayout =
            when (viewType) {
                Layout.VERTICAL ->
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.vertical_horizontal_layout, parent, false)
                Layout.HORIZONTAL ->
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.vertical_horizontal_layout, parent, false)
                else -> {
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.grid_layout, parent, false)
                }
            }
        return DogHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: DogHolder, position: Int) {
        val item = dataList[position]
        holder.tvName.text = "${item.name} (${item.breed.toString()})"
        holder.tvAge.text = item.age.toString()
        holder.tvHabit.text = item.habit
        holder.tvPic.setImageResource(item.imageResId)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}