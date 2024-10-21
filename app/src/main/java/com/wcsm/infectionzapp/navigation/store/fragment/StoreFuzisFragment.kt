package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreFuzisBinding

class StoreFuzisFragment : Fragment() {

    private var _binding: FragmentStoreFuzisBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreFuzisBinding.inflate(inflater, container, false)

        val fuzisData = "AR15 SD - 20 IFZ\nACRG33 - 30 IFZ\nACRG33 SD - 30 IFZ\nACR SD Camo - 30 IFZ\nFamas - 30 IFZ\nFamas SD - 32 IFZ\nM4A1 CCO - 15 IFZ\nM4A1 White - 300 IFZ\nM4A1 Gold SD - 350 IFZ\nM4A1 Infernal - 500 IFZ\nM4A1 CCO SD - 15 IFZ\nM4A1 CCO SD EXTENDED - 40 IFZ\nM4A1 Skull SD - 300 IFZ\nM4A1 Blue Ice SD - 300 IFZ\nM4A1 Halloween SD - 3600 IFZ\nM4A1 Holo - 15 IFZ\nM4A3 CCO - 15 IFZ\nM16A2 - 16\nM16A2 M203 - 16 IFZ\nM16A2 Infernal - 500 IFZ\nM16A2 Sunrise - 350 IFZ\nM16A4 ACOG - 16 IFZ\nL85A2 RIS Holo - 40 IFZ\nLK05 SD - 30 IFZ\nHK417 SD - 30 IFZ\nMK-10 Red - 320 IFZ\nRPK - 35 IFZ\nRPK EXTENDED - 65 IFZ\nRPK Gold - 350 IFZ\nRPK Halloween - 3600 IFZ\nAKM - 32 IFZ\nAKM Mossy - 32 IFZ\nAKM Phoenix - 320 IFZ\nAK-12 Desert - 30 IFZ\nAK-74 GP-25 - 15 IFZ\nAK-74 Gold - 320 IFZ\nAK-74 Xmas - 280 IFZ\nAK-74 Dark - 320 IFZ\nAK-74 Blue Ice - 320 IFZ\nAK-74 Assimov - 300 IFZ\nAK-74 Imperatriz - 300 IFZ\nAK-74 Neon Rider - 300 IFZ\nAK.74 Redline - 300 IFZ\nAK-74 Golden Dragon - 1200 IFZ\nAK-107 G - `15 IFZ\nAK-47 Camo - 15 IFZ\nAKS-74 - 15 IFZ\nAKS-74U - 14 IFZ\nAKS-74UN KOBRA - 15 IFZ\nAKS Gold - 350 IFZ\nSA-58V ACOG - 45 IFZ\nFN FAL - 50 IFZ\nFN Gold - 320 IFZ\nSR-15 Pink Girl - 350 IFZ\nG36C - 32 IFZ\nG36C SD - 32 IFZ\nG636C Camo - 32 IFZ\nG36C-SD Camo - 32 IFZ\nG36C Vindicator - 300 IFZ\nSteyr Aug - 50 IFZ\nFN SCAR - 35 IFZ\nFN SCAR Phoenix - 320 IFZ\nFN SCAR SD - 35 IFZ\nIMI Galil - 45 IFZ\n"
        val fuzisMuniData = "30Rnd. STANAG - 10 IFZ\n30Rnd. AKM - 14 IFZ\n30Rnd. AK - 10 IFZ\n30Rnd. SA58 - 20 IFZ\n30Rnd. FN FAL - 20 IFZ\n30Rnd. G36 - 20 IFZ\n30Rnd. Steyr Aug - 20 IFZ\n30Rnd. FN SCAR - 20 IFZ\n30Rnd. SR15 - 20 IFZ\n30Rnd. Galil - 20 IFZ"

        binding.textStoreFuzisData.text = fuzisData
        binding.textStoreFuzisMuniData.text = fuzisMuniData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


