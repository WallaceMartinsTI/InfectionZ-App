package com.wcsm.infectionzapp.presentation.ui.navigation

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.ActivityHelpWikiBinding
import com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.MedicinesFragment
import com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.TutorialsFragment
import com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.VehiclePartsFragment
import com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.VestsAndHelmetsFragment

class HelpWikiActivity : AppCompatActivity() {

    private val binding by lazy { ActivityHelpWikiBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        formatHelpWikiTitle()

        initTutorialsFragment()

        with(binding) {
            btnHelpWikiTutorials.setOnClickListener {
                initTutorialsFragment()
            }
            btnHelpWikiVehicleParts.setOnClickListener {
                initVehiclePartsFragment()
            }
            btnHelpWikiMedicines.setOnClickListener {
                initMedicinesFragment()
            }
            btnHelpWikiVestsAndHelmets.setOnClickListener {
                initVestsAndHelmetsFragment()
            }
        }
    }

    private fun formatHelpWikiTitle() {
        val fullText = "INFECTION Z\nAJUDA/WIKI"
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
            fullText.indexOf("AJUDA/WIKI"),
            fullText.indexOf("AJUDA/WIKI") + "AJUDA/WIKI".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textHelpWikiTitle.text = spannable
    }

    private fun initTutorialsFragment() {
        supportFragmentManager.commit {
            replace<TutorialsFragment>(R.id.fcvHelpWikiTutorials)
        }
    }

    private fun initVehiclePartsFragment() {
        supportFragmentManager.commit {
            replace<VehiclePartsFragment>(R.id.fcvHelpWikiTutorials)
        }
    }

    private fun initMedicinesFragment() {
        supportFragmentManager.commit {
            replace<MedicinesFragment>(R.id.fcvHelpWikiTutorials)
        }
    }

    private fun initVestsAndHelmetsFragment() {
        supportFragmentManager.commit {
            replace<VestsAndHelmetsFragment>(R.id.fcvHelpWikiTutorials)
        }
    }
}