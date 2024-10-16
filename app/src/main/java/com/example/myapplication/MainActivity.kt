package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciando os componentes da interface
        val textView: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)

        // Configurando o evento de clique no botão
        button.setOnClickListener {
            val textoDigitado = editText.text.toString()

            // Exibindo um Toast com o texto digitado no EditText
            Toast.makeText(this, "Você digitou: $textoDigitado", Toast.LENGTH_SHORT).show()
        }
    }
}
