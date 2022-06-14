package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonSecond = findViewById<Button>(R.id.button_secondActivity)
        val textViewSecond = findViewById<TextView>(R.id.textview_secondActivity)
        buttonSecond.setOnClickListener{
            textViewSecond.text = "Nice job Hirun"
        }
    }
}