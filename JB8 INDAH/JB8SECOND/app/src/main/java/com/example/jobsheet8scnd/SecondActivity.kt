package com.example.jobsheet8scnd

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val MainActivity = findViewById<Button>(this@MainActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}