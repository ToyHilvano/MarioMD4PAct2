package com.hilvano.uitwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uitwo.databinding.ActivityAddEducationBinding

class ActivityAddEducation : AppCompatActivity() {

    private lateinit var binding: ActivityAddEducationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAddAnotherSchoolButton()
        setupBackButton()

    }
    private fun setupAddAnotherSchoolButton() {
        binding.addAnotherEdButton.setOnClickListener {
            val intent = Intent(this@ActivityAddEducation, ActivityAddEducation::class.java)
            startActivity(intent)
        }
    }
    private fun setupBackButton() {
        binding.backButton.setOnClickListener {
            val intent = Intent(this@ActivityAddEducation, ActivityPage2::class.java)
            startActivity(intent)
        }
    }
}