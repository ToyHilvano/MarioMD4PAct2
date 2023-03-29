package com.hilvano.uitwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uitwo.databinding.ActivityReferencesBinding

class ActivityReferences : AppCompatActivity() {

    private lateinit var binding: ActivityReferencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferencesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAddAnotherRefButton()
        setupBackRefButton()
    }
    private fun setupAddAnotherRefButton() {
        binding.addAnotherRefButton.setOnClickListener {
            val intent = Intent(this@ActivityReferences, ActivityReferences::class.java)
            startActivity(intent)
        }
    }
    private fun setupBackRefButton() {
        binding.backButton2.setOnClickListener {
            val intent = Intent(this@ActivityReferences, ActivityPage2::class.java)
            startActivity(intent)
        }
    }
}