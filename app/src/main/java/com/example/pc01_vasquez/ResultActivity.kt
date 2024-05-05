package com.example.pc01_vasquez

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val tvPromedio = findViewById<TextView>(R.id.tvPromedio)

        //recibir datos de la otra pantalla, dame los extras
        val promedio: Double = intent.extras?.getDouble("extraPromedio") ?: 0.0
        val resultado: String = intent.extras?.getString("extraResultado").orEmpty()
        tvPromedio.text = "Promedio: $promedio"
        tvResult.text = "Resultado: $resultado"

    }
}