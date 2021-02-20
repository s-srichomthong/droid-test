package com.srichomthong.droidtest.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.srichomthong.droidtest.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val extra: String? = intent.getStringExtra("USERNAME")

        val usernameTv = findViewById<TextView>(R.id.act_main_username)
        usernameTv.text = "Welcome $extra"
    }
}