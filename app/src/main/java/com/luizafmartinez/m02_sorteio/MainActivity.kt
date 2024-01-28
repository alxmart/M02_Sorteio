package com.luizafmartinez.m02_sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View) {

        val textoResultado = findViewById<TextView>(R.id.tvResultado)
        val numero = Random().nextInt(61)
        textoResultado.setText("Número gerado: $numero")
    }

}


