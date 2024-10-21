package com.wcsm.infectionzapp.navigation.sales

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.ActivitySalesBinding
import com.wcsm.infectionzapp.navigation.sales.skinsclan.adapter.SalesSkinClanAdapter

class SalesActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySalesBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        formatSalesTitle()

        binding.rvSalesSkinClan.adapter = SalesSkinClanAdapter()
        binding.rvSalesSkinClan.layoutManager = GridLayoutManager(this, 2)
    }

    private fun formatSalesTitle() {
        val fullText = "INFECTION Z\nVENDAS"
        val spannable = SpannableString(fullText)
        val redColor = resources.getColor(R.color.primaryRed)

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("Z"),
            fullText.indexOf("Z") + "Z".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("VENDAS"),
            fullText.indexOf("VENDAS") + "VENDAS".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textSalesTitle.text = spannable
    }
}