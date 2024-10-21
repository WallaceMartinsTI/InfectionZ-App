package com.wcsm.infectionzapp.navigation.bosses

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.ActivityBossesBinding
import com.wcsm.infectionzapp.databinding.BossesPopupBinding
import com.wcsm.infectionzapp.navigation.bosses.adapter.BossesAdapter
import com.wcsm.infectionzapp.navigation.bosses.model.BossItem

class BossesActivity : AppCompatActivity() {

    private val binding by lazy { ActivityBossesBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        formatBossesTitle()

        binding.rvBosses.adapter = BossesAdapter { boss ->
            showBossPopup(boss)
        }
        binding.rvBosses.layoutManager = GridLayoutManager(this, 2)
    }

    private fun formatBossesTitle() {
        val fullText = "INFECTION Z\nBOSSES"
        val spannable = SpannableString(fullText)
        val redColor =  resources.getColor(R.color.primaryRed)

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("Z"),
            fullText.indexOf("Z") + "Z".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            ForegroundColorSpan(redColor),
            fullText.indexOf("BOSSES"),
            fullText.indexOf("BOSSES") + "BOSSES".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textBossesTitle.text = spannable
    }

    private fun showBossPopup(boss: BossItem) {
        val binding = BossesPopupBinding.inflate(LayoutInflater.from(this))

        val dialog = AlertDialog.Builder(this)
            .setView(binding.root)
            .create()

        with(binding) {
            bossesPopupName.text = boss.name
            bossesPopupLife.text = "Vida: ${boss.life}"
            bossesPopupRespawn.text = "Tempo de Respawn: ${boss.respawnTime}"
            bossesPopupDescription.text = boss.description

            ivBossesPopupBoss.setImageResource(boss.bossImageResource)
            ivBossesPopupLoc1.setImageResource(boss.bossLocationImage1Resouce)
            ivBossesPopupLoc2.setImageResource(boss.bossLocationImage2Resouce)

            bossesPopupDismiss.setOnClickListener {
                dialog.dismiss()
            }
        }

        dialog.show()
    }
}