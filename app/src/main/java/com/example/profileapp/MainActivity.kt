package com.example.profileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val ageInput = findViewById<EditText>(R.id.ageInput)
        val submitBtn = findViewById<Button>(R.id.submitBtn)

        submitBtn.setOnClickListener {
            val name = nameInput.text.toString()
            val age = ageInput.text.toString()

            // 1. Check if Name is empty
            if (name.isEmpty()) {
                nameInput.error = "Please enter your name"
                return@setOnClickListener // Stops the code here so it doesn't move to the next screen
            }

            // 2. Check if Age is empty
            if (age.isEmpty()) {
                ageInput.error = "Please enter your age"
                return@setOnClickListener // Stops the code here too
            }

            // 3. If we reached here, it means both are NOT empty!
            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("USER_NAME", name)
            intent.putExtra("USER_AGE", age)
            startActivity(intent)
        }
    }
}