package com.example.ryanarafeh_comp304_lab1_ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            callActivity()
        }
    }

    private fun callActivity() {

        val editTextEnrollment = findViewById<EditText>(R.id.editTextEnrollment)
        val enrollmentNumber = editTextEnrollment.text.toString()
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val name = editTextName.text.toString()


        val intent = Intent(this, DisplayActivity::class.java).also{
            it.putExtra("ENROLLMENT_NUMBER", enrollmentNumber)
            it.putExtra("NAME", name)
            startActivity(it)
        }
    }
}