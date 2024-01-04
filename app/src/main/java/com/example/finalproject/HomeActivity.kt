package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        val cartImageView: ImageView = findViewById(R.id.imageView16)
        cartImageView.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }
        val akunImageView: ImageView = findViewById(R.id.imageView17)
        akunImageView.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }
        val view1ImageView: ImageView = findViewById(R.id.imageView11)
        view1ImageView.setOnClickListener {
            val intent = Intent(this, Productview2::class.java)
            startActivity(intent)
        }
        val view2ImageView: ImageView = findViewById(R.id.imageView18)
        view2ImageView.setOnClickListener {
            val intent = Intent(this, Productview1::class.java)
            startActivity(intent)
        }

    }
}
