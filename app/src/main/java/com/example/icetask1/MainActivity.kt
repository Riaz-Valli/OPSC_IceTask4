package com.example.icetask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var btnChinese: Button
    private lateinit var btnFrench: Button
    private lateinit var btnGerman: Button
    private lateinit var btnEnglish: Button
    private lateinit var btnSpanish: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        btnChinese = findViewById(R.id.btnChinese)
        btnChinese.setOnClickListener {
            textView.text = "你好，世界！"
        }

        btnFrench = findViewById(R.id.btnFrench)
        btnFrench.setOnClickListener {
            textView.text = "Bonjour le monde !"
        }

        btnGerman = findViewById(R.id.btnGerman)
        btnGerman.setOnClickListener {
            textView.text = "Hallo Welt!"
        }

        btnEnglish = findViewById(R.id.btnEnglish)
        btnEnglish.setOnClickListener {
            textView.text = "Hello World！"
        }

        btnSpanish = findViewById(R.id.btnSpanish)
        btnSpanish.setOnClickListener {
            textView.text = "¡Hola Mundo!"
        }
    }


}
