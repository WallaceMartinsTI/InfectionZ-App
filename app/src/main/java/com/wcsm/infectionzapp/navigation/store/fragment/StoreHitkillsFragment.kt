package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreHitkillsBinding

class StoreHitkillsFragment : Fragment() {

    private var _binding: FragmentStoreHitkillsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreHitkillsBinding.inflate(inflater, container, false)

        val hitkillsData = "M107 - 60 IFZ\nM107 SD - 62 IFZ\nM107 Gold - 400 IFZ\nM107 Halloween - 3800 IFZ\nM107 Christmas - 2800 IFZ\nPGM Hecatell - 70 IFZ\nVKS - 70 IFZ\nAS50 - 70 IFZ\nAS50 SD - 72 IFZ\nAS50 Valentines - 350 IFZ\nAS50 Gold - 400 IFZ\nDSR50 - 70 IFZ\nKSVK - 70 IFZ\nER7 RFW - 70 IFZ\nCheytac M200 - 60 IFZ\nCheyTac M200 SD - 62 IFZ\nCheyTac M200 SD Halloween - 3800 IFZ\nCheyTac M200 SD Christmas - 3800 IFZ\nCheyTac M200 SD Gold - 400 IFZ\nCheyTac M200 SD Valentines - 350 IFZ\nAWM - 100 IFZ\nAWM Dragon Lore - 400 IFZ\nAWM Blue Ice - 350 IFZ\nAWM Assimov - 380 IFZ\nAWM Xmas - 350 IFZ\nAWM Valentines - 350 IFZ\nL96 - 100 IFZ\nL96 SD - 110 IFZ\nGM6 Lynx - 80 IFZ\nGM6 Lynx Golden Dragon - 850 IFZ\nMGL-140 - 1500 IFZ"
        val hitkillsMuniData = "5Rnd. M107 - 50 IFZ\n5Rnd. PGM - 70 IFZ\n5Rnd. AS50 - 70 IFZ\n5Rnd. DSR50 - 70 IFZ\n5Rnd. KSVK - 70 IFZ\n5Rnd. VKS - 70 IFZ\n5Rnd. ER7 - 70 IFZ\n5Rnd. Cheytac M200 - 50 IFZ\n5Rnd. AWM - 100 IFZ\n5Rnd. L96 - 100 IFZ\nMGL. Grenade - 500 IFZ\n5Rnd. GM6 - 70 IFZ\nGrenade - 400 IFZ"

        binding.textStoreHitkillsData.text = hitkillsData
        binding.textStoreHitkillsMuniData.text = hitkillsMuniData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


