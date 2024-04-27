package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECIATION")
class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            val intent = Intent(this,startActivity::class.java)
            startActivity(intent)
            finish()

        },3000)

        }
    }


