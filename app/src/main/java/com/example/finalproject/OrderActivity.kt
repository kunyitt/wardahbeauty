package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order)

        val blkorderImageView: ImageView = findViewById(R.id.imageView30)
        blkorderImageView.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }


        val DblkorderImageView: ImageView = findViewById(R.id.imageView31)
        DblkorderImageView.setOnClickListener {
            val intent = Intent(this, DetailOrderActivity::class.java)
            startActivity(intent)
        }

    }
}