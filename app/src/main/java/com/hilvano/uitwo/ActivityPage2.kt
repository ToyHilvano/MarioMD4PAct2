package com.hilvano.uitwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uitwo.databinding.ActivityPage2Binding

class ActivityPage2 : AppCompatActivity() {

    private lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setupEducationButton()
        setupEmploymentButton()
        setupReferencesButton()
        setupAllDoneButton()

    }
    private fun setupEducationButton() {
        binding.educationButton.setOnClickListener {
            val intent = Intent(this@ActivityPage2, ActivityAddEducation::class.java)
            startActivity(intent)
        }
    }
    private fun setupEmploymentButton() {
        binding.employmentButton.setOnClickListener {
            val intent = Intent(this@ActivityPage2, ActivityAddEmployment::class.java)
            startActivity(intent)
        }
    }
    private fun setupReferencesButton() {
        binding.referencesButton.setOnClickListener {
            val intent = Intent(this@ActivityPage2, ActivityReferences::class.java)
            startActivity(intent)
        }
    }
    private fun setupAllDoneButton() {
        binding.allDoneButton.setOnClickListener {
            val intent = Intent(this@ActivityPage2, ActivityAllDone::class.java)
            startActivity(intent)
        }
    }
}