package com.example.petmanagerac

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.petmanagerac.R.id.edName
import java.util.regex.Pattern

class RegisterActivity : AppCompatActivity() {
    private var edName : EditText?=null
    private var edNit : EditText?=null
    private var edEmail : EditText?=null
    private var edPassword : EditText?=null
    private var chbPolicies : CheckBox?=null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        edName= findViewById(R.id.edName)
        edNit= findViewById(R.id.edNit)
        edEmail= findViewById(R.id.edEmail)
        edPassword= findViewById(R.id.edtPasswordReg)
        chbPolicies= findViewById(R.id.chb_Policies)
    }

    fun onRegister(view: View) {
        if (ValidateForm())
        {
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
        }

    }

    private fun ValidateForm(): Boolean
    {
        var validate=true
        val nameInput=edName!!.text.toString()
        val nitInput=edNit!!.text.toString()
        val emailInput=edEmail!!.text.toString()
        val passwordInput=edPassword!!.text.toString()

        if (!chbPolicies!!.isChecked)
        {
            validate=false
        }
        if (TextUtils.isEmpty(edName!!.text.toString()))
        {
            edName!!.error="Requerido"
            validate=false
        }
        else edName!!.error=null

        if (TextUtils.isEmpty(edPassword!!.text.toString()))
        {
            edPassword!!.error="Requerido"
            validate=false
        }
        else edPassword!!.error=null

        return validate
    }


}