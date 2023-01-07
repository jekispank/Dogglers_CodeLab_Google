package com.jekis.dogglers.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jekis.dogglers.const.Layout
import com.jekis.dogglers.databinding.ActivityGridBinding

class GridActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGridBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}