package com.example.tabs

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.tabs.Fragment.Textactivity
import com.google.android.material.tabs.TabLayout

class Tabs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_tabs)

        lateinit var text : String
        val tabLayout = findViewById<TabLayout>(R.id.tl)

        openTextActivity("HOME") ///se traba si no inicio una y quiero iniciar en home. por defecto alguna teiene que estar iniciada y toma la primera y ahi crashea home
        // Listener para manejar la selección de pestañas
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                 text = when (tab?.position) {
                    0 -> "HOME"
                    1 -> "CHATS"
                    2 -> "OPTIONS"
                    else -> "Default Text"
                }
                openTextActivity(text)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {
                openTextActivity(text)
        }
    })
}
    private fun openTextActivity(text: String) {
        intent = Intent(this@Tabs, Textactivity::class.java).apply {
            putExtra("text", text)
        }
        startActivity(intent)
    }
}
