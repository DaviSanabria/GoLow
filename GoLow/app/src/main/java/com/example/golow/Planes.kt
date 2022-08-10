package com.example.golow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Planes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planes)
        var boton: Button = findViewById(R.id.prueba_btn)
        boton.setOnClickListener() {
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, Cuestionario::class.java))
        }
    }
}