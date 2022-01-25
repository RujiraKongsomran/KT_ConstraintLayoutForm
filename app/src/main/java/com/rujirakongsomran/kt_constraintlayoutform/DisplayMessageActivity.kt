package com.rujirakongsomran.kt_constraintlayoutform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rujirakongsomran.kt_constraintlayoutform.databinding.ActivityDisplayMessageBinding

class DisplayMessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_display_message)
        binding = ActivityDisplayMessageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val firstname = intent.getStringExtra(EXTRA_FIRSTNAME).orEmpty()
        val lastname = intent.getStringExtra(EXTRA_LASTNAME).orEmpty()
        val birthdate = intent.getStringExtra(EXTRA_BIRTHDATE).orEmpty()
        val country = intent.getStringExtra(EXTRA_COUNTRY).orEmpty()

        binding.tvFirstname.text = firstname
        binding.tvLastname.text = lastname
        binding.tvBirthdate.text = birthdate
        binding.tvCountry.text = country

    }
}