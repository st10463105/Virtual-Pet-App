package com.example.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // private lateinit var buttonStart: Button
    lateinit var ebuttonStart : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the button find by id
        ebuttonStart = findViewById(R.id.button_start)

        // Set click listener for the button
        ebuttonStart.setOnClickListener {

            // Function to start the EmotionActivity
            val intent = Intent(this,EmotionActivity::class.java)

            startActivity(intent)



        }

    }
}