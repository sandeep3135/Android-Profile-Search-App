package com.example.profileapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val welcomeTxt = findViewById<TextView>(R.id.welcomeTxt)

        val name = intent.getStringExtra("USER_NAME")
        val age = intent.getStringExtra("USER_AGE")

        welcomeTxt.text = "Hello $name, you are $age years old!"
    }
}