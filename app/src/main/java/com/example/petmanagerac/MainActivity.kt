package com.example.petmanagerac

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var edtUsername: EditText?=null
    private var edtPassword: EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)

    }

    fun onLogin(btnLogin: View){
        val messagepassword=getString(R.string.messagepassword)
        val messageusername=getString(R.string.messageusername)
        var username : String=edtUsername!!.text.toString()

        if (username=="alan@correo.co")
        {
            if(edtPassword!!.text.toString()=="12345")
            {
                val negativeButton={ _: DialogInterface, _:Int->}
                val positiveButton={ dialog: DialogInterface, which:Int->
                    val intent = Intent(this, WelcomeActivity::class.java)
                    startActivity(intent)
                }

                val dialog= AlertDialog.Builder(this)
                    .setTitle("Welcome")
                    .setMessage("User: " + username)
                    .setPositiveButton("ok",positiveButton)
                    .setNegativeButton("Cancel",negativeButton)
                    .create()
                    .show()
            }
            else {
                val dialog = AlertDialog.Builder(this)
                    .setTitle("ERROR")
                    .setMessage(messagepassword)
                    .create()
                    .show()
            }
        }
        else {
            Toast.makeText(this, messageusername, Toast.LENGTH_LONG)
                .show()
        }
    }

    fun onRegister(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}