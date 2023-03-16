package com.example.petmanagerac

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    private var txtemail: TextView?=null
    private var txtprovider: TextView?=null
    private var btnLogOut: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

    }

}