package com.example.surfmemes

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(goToAutorization, 3000)
    }

    val goToAutorization = Runnable {
        val intent = Intent(this, AutorizationActivity::class.java)
        startActivity(intent)
    }

}
