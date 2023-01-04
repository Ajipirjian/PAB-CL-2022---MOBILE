package com.example.myanimelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class aboute_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboute)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}