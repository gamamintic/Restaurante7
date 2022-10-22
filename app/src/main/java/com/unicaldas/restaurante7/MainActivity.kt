package com.unicaldas.restaurante7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var edtUsername: EditText? = null
    private var edtPassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onLogin(botonLogin: View) {
        if (edtUsername!!.text.toString() == "abcd@gmail.com") {
            if (edtPassword!!.text.toString() == "1234") {
                val intento = Intent(this, MainActivity2::class.java)
                startActivity(intento)
                Toast.makeText(
                    applicationContext,
                    getResources().getString(R.string.tex_welcome),
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Toast.makeText(
                    this,
                    getResources().getString(R.string.tex_notpass),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    fun onLogin2(botonLogin: View) {
        if (edtUsername!!.text.toString() == "") {
            if (edtPassword!!.text.toString() == "") {
                val intento = Intent(this, WelcomeActivity::class.java)
                startActivity(intento)
                Toast.makeText(
                    applicationContext,
                    getResources().getString(R.string.tex_welcome),
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}