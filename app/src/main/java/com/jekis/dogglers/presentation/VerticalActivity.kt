package com.jekis.dogglers.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jekis.dogglers.const.Layout
import com.jekis.dogglers.databinding.ActivityVerticalBinding

class VerticalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityVerticalBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvVertical.adapter = DogAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        // Specify fixed size to improve performance
        binding.rvVertical.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}