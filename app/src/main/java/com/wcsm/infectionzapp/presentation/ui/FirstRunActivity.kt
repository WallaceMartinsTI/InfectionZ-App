package com.wcsm.infectionzapp.presentation.ui

import android.content.Intent
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.ActivityFirstRunBinding

class FirstRunActivity : AppCompatActivity() {

    private val binding by lazy { ActivityFirstRunBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fillWelcomeMessage()

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this, MainScreenActivity::class.java)
            startActivity(intent)
        }
    }

    private fun fillWelcomeMessage() {
        val fullText = "Seja bem-vindo ao IFZ\n\nA maior comunidade de \nMTA DayZ do Brasil"
        val spannable = SpannableString(fullText)
        val redColor =  resources.getColor(R.color.primaryRed)

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("IFZ"),
            fullText.indexOf("IFZ") + "IFZ".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("MTA DayZ"),
            fullText.indexOf("MTA DayZ") + "MTA DayZ".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("Brasil"),
            fullText.indexOf("Brasil") + "Brasil".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textWelcome.text = spannable
    }
}