package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class EmotionActivity : AppCompatActivity() {

    // private lateinit var buttonStart: Button
    private lateinit var ebuttonFeed: Button
    private lateinit var ebuttonClean: Button
    private lateinit var ebuttonPlay: Button
    private lateinit var eimageView: ImageView
    private lateinit var textHealth: TextView
    private lateinit var textHunger: TextView
    private lateinit var textCleanliness: TextView

    private var health = 100
    private var hunger = 50
    private var cleanliness = 75

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion)

        // Initialize the button find by id
        ebuttonFeed = findViewById(R.id.btn_feed)
        ebuttonClean = findViewById(R.id.btn_clean)
        ebuttonPlay = findViewById(R.id.btn_play)
        eimageView = findViewById(R.id.imageView)
        textHealth = findViewById(R.id.text_health)
        textHunger = findViewById(R.id.text_hunger)
        textCleanliness = findViewById(R.id.text_cleanliness)

// Set the initial tag to "welcome"
        eimageView.tag = "welcome"

// Set initial values
        updateStatus()

// Button Feed
        ebuttonFeed.setOnClickListener {
            if (eimageView.tag == "welcome") {
                eimageView.setImageResource(R.drawable.feed)
                eimageView.tag = "feed"
                health += 10
                hunger -= 10
                updateStatus()
            } else {
                eimageView.setImageResource(R.drawable.welcome)
                eimageView.tag = "welcome"
            }
        }

// Button Clean
        ebuttonClean.setOnClickListener {
            if (eimageView.tag == "welcome" || eimageView.tag == "feed") {
                eimageView.setImageResource(R.drawable.clean)
                eimageView.tag = "clean"
                cleanliness += 10
                updateStatus()
            } else {
                eimageView.setImageResource(R.drawable.welcome)
                eimageView.tag = "welcome"
            }
        }

// Button Play
        ebuttonPlay.setOnClickListener {
            if (eimageView.tag == "welcome" || eimageView.tag == "feed" || eimageView.tag == "clean") {
                eimageView.setImageResource(R.drawable.play)
                eimageView.tag = "play"
                health += 5
                updateStatus()
            } else {
                eimageView.setImageResource(R.drawable.welcome)
                eimageView.tag = "welcome"
            }
        }
    }
    // my textview status
    private fun updateStatus() {
        textHealth.text = "Health: $health"
        textHunger.text = "Hunger: $hunger"
        textCleanliness.text = "Cleanliness: $cleanliness"
    }
}
