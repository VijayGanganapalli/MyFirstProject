package com.example.vijay.myfirstproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {

    private lateinit var textViewMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        textViewMessage = findViewById(R.id.txtViwSU)

        textViewMessage.text = "Welcome to Sign Up page"
    }
}
