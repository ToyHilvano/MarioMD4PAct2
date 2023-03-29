package com.hilvano.uitwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hilvano.uitwo.databinding.ActivityAddEmploymentBinding

class ActivityAddEmployment : AppCompatActivity() {

    private lateinit var binding: ActivityAddEmploymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddEmploymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAddAnotherEmButton()
        setupBackButton()

    }
    private fun setupAddAnotherEmButton() {
        binding.addAnotherEmButton.setOnClickListener {
            val intent = Intent(this@ActivityAddEmployment, ActivityAddEmployment::class.java)
            startActivity(intent)
        }
    }
    private fun setupBackButton() {
        binding.backButton.setOnClickListener {
            val intent = Intent(this@ActivityAddEmployment, ActivityPage2::class.java)
            startActivity(intent)
        }
    }

}