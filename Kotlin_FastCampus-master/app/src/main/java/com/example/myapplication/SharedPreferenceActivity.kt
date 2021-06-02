package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_sharedpreference.*

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sharedpreference)

        // MODE_PRIVATE : 생성한 어플리케이션에서만 사용 가능
        // MODE_WORLD_READABLE : 다른 어플리케이션에서 사용 가능 -> 읽기만 가능
        // MODE_WORLD_WRITEABLE : 다른 어플리케이션에서 사용 가능 -> 기록도 가능

//        val editor = sharedPreference.edit()
//        editor.putString("hello", "안녕하세요")
//        editor.commit()

        save_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.putString("hello", "안녕하세요")
            editor.putString("goodbye", "안녕히가세요")
            editor.commit()
        }

        load_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val value1 = sharedPreference.getString("hello", "no data1")
            val value2 = sharedPreference.getString("goodbye", "no data2")
            Log.d("key-value", "Value 1 : " + value1)
            Log.d("key-value", "Value 2 : " + value2)
        }

        delete_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.remove("hello")
            editor.commit()
        }

        delete_all_button.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.clear()
            editor.commit()

        }
    }
}