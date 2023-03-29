package com.hilvano.uitwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uitwo.databinding.ActivityTemplateBinding

class ActivityTemplate : AppCompatActivity() {

    private lateinit var binding : ActivityTemplateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTemplateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupPage2Button()

    }

    private fun setupPage2Button() {
        binding.page2Button.setOnClickListener {
            val intent = Intent(this@ActivityTemplate, ActivityPage2::class.java)
            startActivity(intent)
        }
    }
}