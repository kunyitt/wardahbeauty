package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Productview2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.productview2)

        val blkhm1ImageView: ImageView = findViewById(R.id.imageView25)
        blkhm1ImageView.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val blkcrtButton: Button = findViewById(R.id.button14)
        blkcrtButton.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }


    }
}