package com.example.fixcrew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val navNotification = findViewById<ImageView>(R.id.navNotifications)
        val navHome = findViewById<ImageView>(R.id.navHome)
        val navMenu = findViewById<ImageView>(R.id.navMenu)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        navNotification.setOnClickListener{
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        navHome.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        navMenu.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }

        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}