package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivitydress2::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivitydress3::class.java))
    }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,MainActivitydress4::class.java))
}
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext, MainActivitydress5::class.java))
        }