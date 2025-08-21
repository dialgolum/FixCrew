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

class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_schedule)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val btnConfirm = findViewById<Button>(R.id.btnConfirm)
        val navNotification = findViewById<ImageView>(R.id.navNotifications)
        val navHome = findViewById<ImageView>(R.id.navHome)
        val navProfile = findViewById<ImageView>(R.id.navProfile)

        navNotification.setOnClickListener{
            val intent = Intent(this, NotificationActivity::class.java)
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

        btnConfirm.setOnClickListener {
            val intent = Intent(this, AppliersActivity::class.java)
            startActivity(intent)
        }

    }
}