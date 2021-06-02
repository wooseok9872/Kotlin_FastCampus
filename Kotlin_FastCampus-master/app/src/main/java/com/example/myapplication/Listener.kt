package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {

    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        hello.setOnClickListener {
            Log.d("click", "Click!!")
            hello.setText("안녕하세요")
            image.setImageResource(R.drawable.band)
            number += 10
            Log.d("number", "" + number)
        }
    }

}