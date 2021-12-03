package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var color=""
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Red_button=findViewById<TextView>(R.id.red)
        val Green_button=findViewById<TextView>(R.id.green)
        val Blue_button=findViewById<TextView>(R.id.blue)
        val text=findViewById<TextView>(R.id.box)
        Red_button.setOnClickListener{
            color="Red"
            text.setText("$color was clicked")
        }
        Green_button.setOnClickListener{
            color="Green"
            text.setText("$color was clicked")
        }
        Blue_button.setOnClickListener{
            color="Blue"
            text.setText("$color was clicked")
        }
    }
}