package com.example.fixcrew

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val navMenu = findViewById<ImageView>(R.id.navMenu)
        val navHome = findViewById<ImageView>(R.id.navHome)
        val navProfile = findViewById<ImageView>(R.id.navProfile)

        navMenu.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        navHome.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        navProfile.setOnClickListener{
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}