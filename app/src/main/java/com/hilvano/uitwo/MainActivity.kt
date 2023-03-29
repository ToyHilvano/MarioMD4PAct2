package com.hilvano.uitwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uitwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupProceedButton()
    }
    private fun setupProceedButton() {
        binding.proceedButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityTemplate::class.java)
            startActivity(intent)
        }
    }
}