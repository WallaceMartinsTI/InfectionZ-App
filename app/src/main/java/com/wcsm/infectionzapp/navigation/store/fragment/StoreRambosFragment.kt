package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreRambosBinding

class StoreRambosFragment : Fragment() {

    private var _binding: FragmentStoreRambosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreRambosBinding.inflate(inflater, container, false)

        val rambosData = "M249 SAW - 50 IFZ\nM249 SAW Gold - 300 IFZ\nMk 48 Mod 0 - 70 IFZ\nMk 48 Mod 0 Gold - 320 IFZ\nMk 48 Mod 0 Galaxy - 350 IFZ\nMk 48 Mod 0 Fire - 350 IFZ\nMk 48 Mod Obsidian Dragon - 2000 IFZ\nM240 - 52 IFZ\nM240 Gold - 300 IFZ\nPKM - 60 IFZ\nPKM Gold - 300 IFZ\nPKP - 60 IFZ\nPKP Gold - 300 IFZ\nMG36 - 60 IFZ\nMG36 Digital Camo - 320 IFZ\nFN Minimi - 120 IFZ\nM60 - 140 IFZ\nM60 Gold - 350 IFZ\nM60 Galaxy - 350 IFZ\nKord - 140 IFZ\nKord Gold - 350 IFZ\nKord Fire Dragon - 2100 IFZ\nCrow78 Iron - 3500 IFZ\nMG540 - 140 IFZ\nJanus-7 Xmas - 3200 IFZ"
        val rambosMuniData = "100Rnd. M249 SAW - 50 IFZ\n100Rnd. Mk 48 Mod 0 - 60 IFZ\n100Rnd. M240 - 50 IFZ\n100Rnd. PKM - 50 IFZ\n100Rnd. PKP - 50 IFZ\n100Rnd. MG36 - 50 IFZ\n100Rnd. FN Minimi - 80 IFZ\n100Rnd. M60 - 80 IFZ\n100Rnd. Kord - 80 IFZ\n100Rnd. MG540 - 80 IFZ\n100Rnd. Crow - 170 IFZ\n100Rnd. Janus - 180 IFZ\n"

        binding.textStoreRambosData.text = rambosData
        binding.textStoreRambosMuniData.text = rambosMuniData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

