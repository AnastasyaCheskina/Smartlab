package com.example.smartlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
        checkEmail()
    }
    private fun regexMatch(str: String): Boolean {
        val regex = "^\\S+@\\S+\\.\\S+\$".toRegex()
        return regex.matches(str)
    }
    private fun checkEmail() {
        var email_field = findViewById<EditText>(R.id.email_field)
        var inputTextMessage = findViewById<TextView>(R.id.inputTextMessage)
        var btnNext = findViewById<Button>(R.id.btnNext)
        email_field.doAfterTextChanged {
            if (regexMatch(email_field.text.toString())) {
                inputTextMessage.text = "Вход по E-mail"
                inputTextMessage.setTextColor(getColor(R.color.grey))
                email_field.setBackgroundResource(R.drawable.unactive_input_field)
                btnNext.setBackgroundResource(R.drawable.active_btn)
                btnNext.setOnClickListener() {
                    Toast.makeText(this,"Ура победа",Toast.LENGTH_LONG).show()
                }
            } else {
                inputTextMessage.text = "Неверный формат ввода почты"
                inputTextMessage.setTextColor(getColor(R.color.red))
                email_field.setBackgroundResource(R.drawable.error_input_field)
                btnNext.setBackgroundResource(R.drawable.unactive_btn)
            }
        }
    }
}