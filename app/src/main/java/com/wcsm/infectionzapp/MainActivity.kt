package com.wcsm.infectionzapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.wcsm.infectionzapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Splash Screen
        Handler(Looper.getMainLooper()).postDelayed({
            // PRODUCTION VERSION
            val intent = if(isFirstTimeOpeningApp(this)) {
                saveAppOpened(this)
                Intent(this, FirstRunActivity::class.java)
            } else {
                Intent(this, MainScreenActivity::class.java)
            }

            // DEV VERSION
            // val intent = Intent(this, FirstRunActivity::class.java)

            startActivity(intent)
            finish()
        }, 2000)
    }

    private fun isFirstTimeOpeningApp(context: Context) : Boolean {
        val sharedPreferences = context.getSharedPreferences("IFZPublicPrefs", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("isFirstTime", true)
    }

    private fun saveAppOpened(context: Context) {
        val sharedPreferences = context.getSharedPreferences("IFZPublicPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean("isFirstTime", false)
        editor.apply()
    }
}