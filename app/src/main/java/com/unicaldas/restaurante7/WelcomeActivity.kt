package com.unicaldas.restaurante7

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class WelcomeActivity : AppCompatActivity() {

    private var edtCorreo: EditText? = null
    private var edtClave: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        edtCorreo = findViewById(R.id.edtCorreo)
        edtClave = findViewById(R.id.edtClave)
    }

    fun onLogin3(botonlogin: View) {
        if (edtCorreo!!.text.toString() == "abcd@gmail.com" && edtClave!!.text.toString() == "1234") {

                val positiveButton = { dialog: DialogInterface, which: Int ->
                    val intento = Intent(this, MainActivity::class.java)
                    startActivity(intento)
                }
                val negativeButton = { _: DialogInterface, _: Int -> }
                val dialog = AlertDialog.Builder(this)
                    .setTitle(R.string.tex_welcome)
                    .setMessage("User:" + edtCorreo!!.text.toString())
                    .setPositiveButton("OK", positiveButton)
                    .setNegativeButton(
                        getResources().getString(R.string.tex_cancel),
                        negativeButton
                    )
                dialog.create()
                dialog.show()

            } else {
                Toast.makeText(
                    this,
                    getResources().getString(R.string.tex_notpass),
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }




