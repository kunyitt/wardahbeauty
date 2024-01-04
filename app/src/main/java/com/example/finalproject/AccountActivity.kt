package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)

        val akunTextView: TextView = findViewById(R.id.textView20)
        akunTextView.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        val akun2ImageView: ImageView = findViewById(R.id.imageView32)
        akun2ImageView.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        val orderTextView: TextView = findViewById(R.id.textView21)
        orderTextView.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }

        val order2ImageView: ImageView = findViewById(R.id.imageView33)
        order2ImageView.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }

        val homeImageView: ImageView = findViewById(R.id.imageView42)
       homeImageView.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val home2TextView: TextView = findViewById(R.id.textView24)
        home2TextView.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

        val cartImageView: ImageView = findViewById(R.id.imageView40)
        cartImageView.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }

        val cart2TextView: TextView = findViewById(R.id.textView26)
        cart2TextView.setOnClickListener {
            val intent = Intent(this,CardActivity::class.java)
            startActivity(intent)
        }

    }
}
