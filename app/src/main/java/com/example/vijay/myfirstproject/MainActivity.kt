package com.example.vijay.myfirstproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY_USERNAME = "name"
        const val KEY_PASSWORD = "password"
    }

    lateinit var editTextUserName: EditText
    lateinit var editTextPassword: EditText
    lateinit var buttonSignIn: Button
    lateinit var buttonSignUp: Button
    lateinit var textViewForgotPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUserName = findViewById(R.id.edtxtUname)
        editTextPassword = findViewById(R.id.edtxtPwd)
        buttonSignIn = findViewById(R.id.btnSignIn)
        buttonSignUp = findViewById(R.id.btnSignUp)
        textViewForgotPassword = findViewById(R.id.txtVwFgtPwd)

        buttonSignIn.setOnClickListener {
            val uName:String = editTextUserName.text.toString()
            val password:String = editTextPassword.text.toString()
            startActivity(Intent(applicationContext, SignInActivity::class.java).putExtra(KEY_USERNAME, uName)
                                                                                .putExtra(KEY_PASSWORD, password))
        }
        buttonSignUp.setOnClickListener {
            startActivity(Intent(applicationContext, SignUpActivity::class.java))
        }
        textViewForgotPassword.setOnClickListener {
            startActivity(Intent(applicationContext, ForgotPasswordActivity::class.java))
        }

    }

}
