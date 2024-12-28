package com.example.helloandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências aos elementos da interface
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        // Configuração do clique do botão
        button.setOnClickListener {
            textView.text = "Você clicou no botão!"
        }
    }
}
