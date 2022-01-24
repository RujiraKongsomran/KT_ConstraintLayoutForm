package com.rujirakongsomran.kt_constraintlayoutform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rujirakongsomran.kt_constraintlayoutform.databinding.ActivityMainBinding

const val EXTRA_FIRSTNAME = "com.rujirakongsomran.kt_constraintlayoutform.FIRSTNAME"
const val EXTRA_LASTNAME = "com.rujirakongsomran.kt_constraintlayoutform.LASTNAME"
const val EXTRA_BIRTHDATE = "com.rujirakongsomran.kt_constraintlayoutform.BIRTHDATE"
const val EXTRA_COUNTRY = "com.rujirakongsomran.kt_constraintlayoutform.COUNTRY"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnApply.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage(){
        val firstname = binding.etFirstname.text.toString()
        val lastname = binding.etLastname.text.toString()
        val birthdate = binding.etBirthdate.text.toString()
        val country = binding.etCountry.text.toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_FIRSTNAME, firstname)
            putExtra(EXTRA_LASTNAME, lastname)
            putExtra(EXTRA_BIRTHDATE, birthdate)
            putExtra(EXTRA_COUNTRY, country)
        }
        startActivity(intent)
    }

}