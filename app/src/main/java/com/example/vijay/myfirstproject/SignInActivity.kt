package com.example.vijay.myfirstproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignInActivity : AppCompatActivity() {

    private lateinit var textViewMessageSI: TextView
    private lateinit var textViewMessageSU: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        textViewMessageSI = findViewById(R.id.txtViwUN)
        textViewMessageSU = findViewById(R.id.txtViwPD)

        val uName = intent.getStringExtra(MainActivity.KEY_USERNAME)
        val password = intent.getStringExtra(MainActivity.KEY_PASSWORD)

        textViewMessageSI.text = "Your username is: ${uName}"
        textViewMessageSU.text = "Your password is: ${password}"
    }
}
