package com.example.tabs.Fragment

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tabs.R

class Textactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_text)

        val textView = findViewById<TextView>(R.id.textView)

        val text = intent.getStringExtra("text") ?: "Default Text"
        textView.text = text
    }
}
