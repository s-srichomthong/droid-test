package com.srichomthong.droidtest.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.srichomthong.droidtest.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val emailEdt = findViewById<EditText>(R.id.username)
        val passwordEdt = findViewById<EditText>(R.id.password)
        val loginBtn = findViewById<Button>(R.id.login)

        loginBtn.setOnClickListener {
            if (emailEdt.text.isNotBlank() && passwordEdt.text.isNotBlank()){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("USERNAME", emailEdt.text.toString())
                startActivity(intent)
            }
        }
    }
}