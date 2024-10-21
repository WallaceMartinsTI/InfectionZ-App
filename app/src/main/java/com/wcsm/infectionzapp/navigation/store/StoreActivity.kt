package com.wcsm.infectionzapp.navigation.store

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
import com.wcsm.infectionzapp.databinding.ActivityStoreBinding
import com.wcsm.infectionzapp.navigation.store.fragment.StoreBackpacksFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreFoodFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreFuzisFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreHelmetsFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreHitkillsFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreMedicinesFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreOthersFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreRambosFragment
import com.wcsm.infectionzapp.navigation.store.fragment.StoreVestsFragment

class StoreActivity : AppCompatActivity() {

    private val binding by lazy { ActivityStoreBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        formatStoreTitle()

        with(binding) {
            btnStoreRambos.setOnClickListener {
                initRambosFragment()
            }
            btnStoreFuzis.setOnClickListener {
                initFuzisFragment()
            }
            btnStoreHitkills.setOnClickListener {
                initHitkillsFragment()
            }
            btnStoreOthers.setOnClickListener {
                initOthersFragment()
            }
            btnStoreVests.setOnClickListener {
                initVestsFragment()
            }
            btnStoreHelmets.setOnClickListener {
                initHelmetsFragment()
            }
            btnStoreBackpacks.setOnClickListener {
                initBackpacksFragment()
            }
            btnStoreMedicines.setOnClickListener {
                initMedicinesFragment()
            }
            btnStoreFood.setOnClickListener {
                initFoodFragment()
            }
        }
    }

    private fun formatStoreTitle() {
        val fullText = "INFECTION Z\nLOJINHA"
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
            fullText.indexOf("LOJINHA"),
            fullText.indexOf("LOJINHA") + "LOJINHA".length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        binding.textStoreTitle.text = spannable
    }

    private fun initRambosFragment() {
        supportFragmentManager.commit {
            replace<StoreRambosFragment>(binding.fcvStore.id)
        }
    }

    private fun initFuzisFragment() {
        supportFragmentManager.commit {
            replace<StoreFuzisFragment>(binding.fcvStore.id)
        }
    }

    private fun initHitkillsFragment() {
        supportFragmentManager.commit {
            replace<StoreHitkillsFragment>(binding.fcvStore.id)
        }
    }

    private fun initOthersFragment() {
        supportFragmentManager.commit {
            replace<StoreOthersFragment>(binding.fcvStore.id)
        }
    }

    private fun initVestsFragment() {
        supportFragmentManager.commit {
            replace<StoreVestsFragment>(binding.fcvStore.id)
        }
    }

    private fun initHelmetsFragment() {
        supportFragmentManager.commit {
            replace<StoreHelmetsFragment>(binding.fcvStore.id)
        }
    }

    private fun initBackpacksFragment() {
        supportFragmentManager.commit {
            replace<StoreBackpacksFragment>(binding.fcvStore.id)
        }
    }

    private fun initMedicinesFragment() {
        supportFragmentManager.commit {
            replace<StoreMedicinesFragment>(binding.fcvStore.id)
        }
    }

    private fun initFoodFragment() {
        supportFragmentManager.commit {
            replace<StoreFoodFragment>(binding.fcvStore.id)
        }
    }
}