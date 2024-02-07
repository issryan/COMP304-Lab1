package com.example.ryanarafeh_comp304_lab1_ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val enrollmentNumber = intent.getStringExtra("ENROLLMENT_NUMBER")
        val name = intent.getStringExtra("NAME")
        val enrollmentText = findViewById<TextView>(R.id.enrollment)
        val nameText = findViewById<TextView>(R.id.name)

        enrollmentText.text = "Enrollment Number: $enrollmentNumber"
        nameText.text = "Name: $name"
    }
}