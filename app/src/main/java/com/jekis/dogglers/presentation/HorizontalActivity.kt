package com.jekis.dogglers.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jekis.dogglers.const.Layout
import com.jekis.dogglers.databinding.ActivityHorizontalBinding

class HorizontalActivity: AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHorizontalBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvHorizontal.adapter = DogAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        // Specify fixed size to improve performance
        binding.rvHorizontal.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}