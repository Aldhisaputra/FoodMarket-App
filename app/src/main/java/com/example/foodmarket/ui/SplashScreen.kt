package com.example.foodmarket.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.foodmarket.MainActivity
import com.example.foodmarket.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },5000)
    }
}