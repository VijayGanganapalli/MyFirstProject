package com.example.vijay.myfirstproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var editTextFirstName: EditText
    private lateinit var editTextMiddleName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var editTextSetUsername: EditText
    private lateinit var editTextSetPassword: EditText
    private lateinit var radioButtonMale: RadioButton
    private lateinit var radioButtonFemale: RadioButton
    private lateinit var radioButtonOthers: RadioButton
    private lateinit var editTextGmail: EditText
    private lateinit var editTextPhoneNumber: EditText
    private lateinit var buttonRegister: Button
    private lateinit var buttonClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnRgstr.setOnClickListener {

        }
        btnClr.setOnClickListener {

        }
    }
}
