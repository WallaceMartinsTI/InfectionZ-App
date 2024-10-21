package com.wcsm.infectionzapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.wcsm.infectionzapp.databinding.ActivityMainScreenBinding

class MainScreenActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainScreenBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mainScreenMenuItemAdapter = MainScreenMenuItemAdapter { navigationDestiny ->
            val intent = Intent(this, navigationDestiny::class.java)
            startActivity(intent)
        }

        binding.rvMainScreenMenu.adapter = mainScreenMenuItemAdapter

        binding.rvMainScreenMenu.layoutManager = LinearLayoutManager(this)
    }
}