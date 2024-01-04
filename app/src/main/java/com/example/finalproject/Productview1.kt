package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Productview1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.productview1)


        val blkhm2ImageView: ImageView = findViewById(R.id.imageView25)
        blkhm2ImageView.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val blkcrt1Button: Button = findViewById(R.id.buttonnn)
        blkcrt1Button.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }


    }
}