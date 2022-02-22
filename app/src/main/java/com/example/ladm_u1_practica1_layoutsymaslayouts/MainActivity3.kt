package com.example.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        button.setOnClickListener {
            llamarprimeraventana()
        }

    }

    private fun llamarprimeraventana() {
        val otraVentana = Intent(this, MainActivity::class.java)
        startActivity(otraVentana)
    }
}