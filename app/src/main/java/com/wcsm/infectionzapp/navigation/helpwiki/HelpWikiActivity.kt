package com.wcsm.infectionzapp.navigation.helpwiki

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.ActivityHelpWikiBinding
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiKeysFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiLevelsFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiMedicinesFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiOtherItemsFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiRareGearsFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiTutorialsFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiVehiclePartsFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiVehiclesFragment
import com.wcsm.infectionzapp.navigation.helpwiki.fragment.HelpWikiVestsAndHelmetsFragment

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
            btnHelpWikiLevels.setOnClickListener {
                initLevelsFragment()
            }
            btnHelpWikiOtherItems.setOnClickListener {
                initOtherItemsFragment()
            }
            btnHelpWikiRareGears.setOnClickListener {
                initRareGearsFragment()
            }
            btnHelpWikiKeys.setOnClickListener {
                initKeysFragment()
            }
            btnHelpWikiVehicles.setOnClickListener {
                initVehiclesFragment()
            }
        }
    }

    private fun formatHelpWikiTitle() {
        val fullText = "INFECTION Z\nAJUDA/WIKI"
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
            fullText.indexOf("AJUDA/WIKI"),
            fullText.indexOf("AJUDA/WIKI") + "AJUDA/WIKI".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textHelpWikiTitle.text = spannable
    }

    private fun initTutorialsFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiTutorialsFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initVehiclePartsFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiVehiclePartsFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initMedicinesFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiMedicinesFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initVestsAndHelmetsFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiVestsAndHelmetsFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initLevelsFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiLevelsFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initOtherItemsFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiOtherItemsFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initRareGearsFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiRareGearsFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initKeysFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiKeysFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }

    private fun initVehiclesFragment() {
        supportFragmentManager.commit {
            replace<HelpWikiVehiclesFragment>(binding.fcvHelpWikiTutorials.id)
        }
    }
}