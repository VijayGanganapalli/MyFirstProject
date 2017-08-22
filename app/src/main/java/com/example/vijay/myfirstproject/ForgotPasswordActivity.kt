package com.example.vijay.myfirstproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var textViewMessageFP: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        textViewMessageFP = findViewById(R.id.txtViwFgtPwd)

        textViewMessageFP.text = "Welcome to forgot password page"
    }
}
