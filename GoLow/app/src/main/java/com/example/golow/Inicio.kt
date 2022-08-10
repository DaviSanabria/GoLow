package com.example.golow

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import org.w3c.dom.Text

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var username: TextView = findViewById(R.id.username)
        var password: TextView = findViewById(R.id.password)

        var loginbtn: Button = findViewById(R.id.loginbtn)

        //Usuario

        loginbtn.setOnClickListener {
            if (username.getText().toString().equals("jose") && password.getText().toString()
                    .equals("admin")
            ) {
                //correct
                Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, Cuestionario::class.java))
            } else {
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show()
            }
        }
        //boton google
        var googleBtn: ImageView = findViewById(R.id.google_btn)


        googleBtn.setOnClickListener() {
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
        }
    }


}
