package com.jekis.dogglers.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jekis.dogglers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnVertical.setOnClickListener {
            val intent = Intent(this, VerticalActivity::class.java)
            startActivity(intent)
        }
        binding.btnHorizontal.setOnClickListener {
            val intent = Intent(this, HorizontalActivity::class.java)
            startActivity(intent)
        }
        binding.btnGrid.setOnClickListener {
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }
    }
}