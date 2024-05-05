package com.example.pc01_vasquez

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var etParcial = findViewById<EditText>(R.id.etParcial)
        var etFinal = findViewById<EditText>(R.id.etFinal)
        var etPep = findViewById<EditText>(R.id.etPep)
        var btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val parcial = etParcial.text.toString().toDouble()
            val final = etFinal.text.toString().toDouble()
            val pep = etPep.text.toString().toDouble()
            val promedio = (parcial * 0.3) + (final * 0.3) + (pep * 0.4)
            val resultado = when {
                promedio >= 13 -> "Aprobado"
                else -> "Desaprobado"
            }
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("extraPromedio", promedio)
            intent.putExtra("extraResultado", resultado)
            startActivity(intent)
        }
    }
}