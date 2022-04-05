package com.appsian.kotlinmessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsian.kotlinmessenger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val email = binding.emailEditText.text
        val password = binding.passwordEditText.text


        binding.registerBtn.setOnClickListener {
            Log.d("MainActivity", "Email is: $email")
            Log.d("MainActivity", "Password: $password")
            //firebase auth to make a user wi=ith the password
        }
        binding.alreadyHaveAccountTv.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}