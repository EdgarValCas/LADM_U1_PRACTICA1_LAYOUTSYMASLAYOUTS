package com.example.ladm_u1_practica1_layoutsymaslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            llamarsegundaactivity()
        }

        registrar.setOnClickListener {
            llamarterceractivity()
        }

    }

    private fun llamarterceractivity() {
        val otraVentana = Intent(this, MainActivity3::class.java)
        startActivity(otraVentana)
    }

    private fun llamarsegundaactivity() {
        val otraVentana = Intent(this, MainActivity2::class.java)
        startActivity(otraVentana)
    }


}