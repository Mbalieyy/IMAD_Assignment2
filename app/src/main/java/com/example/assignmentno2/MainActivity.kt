package com.example.assignmentno2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val NxtButton = findViewById<Button>(R.id.NxtButton)

        NxtButton.setOnClickListener {
            val intent = Intent( this, Questions::class.java)
            startActivity(intent)
        }
    }
}