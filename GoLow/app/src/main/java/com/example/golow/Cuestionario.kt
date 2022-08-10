package com.example.golow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Cuestionario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuestionario)

        var boton: Button = findViewById(R.id.enviar_btn)
        boton.setOnClickListener(){
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, Planes::class.java))
        }
    }
}