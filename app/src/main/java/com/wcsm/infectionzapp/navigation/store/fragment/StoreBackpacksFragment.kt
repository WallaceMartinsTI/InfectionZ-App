package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreBackpacksBinding

class StoreBackpacksFragment : Fragment() {

    private var _binding: FragmentStoreBackpacksBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreBackpacksBinding.inflate(inflater, container, false)

        val backpacksData = "Children Backpack - 12 IFZ\nAlpha Backpack - 16 IFZ\nTaloon Backpack [Red] - 18 IFZ\nBag - 21 IFZ\nHunting Backpack [Camo] - 24 IFZ\nSport Bag - 25 IFZ\nGhillie Backpack - 26 IFZ\nBoulder Backpack - 28 IFZ\nCity Backpack [Blue] - 32 IFZ\nRush Backpack [Green] - 34 IFZ\nMarlin Bag - 36 IFZ\nCamo Backpack - 38 IFZ\nCalifornia Backpack - 42 IFZ\nCzech Backpack - 44 IFZ\nTorilla Backpack [Black] - 46 IFZ\nBritish Backpack - 48 IFZ\nBackpack Coyote - 50 IFZ\nBackpack Coyote [Camo] - 52 IFZ\nBackpack Coyote [Desert] - 54 IFZ\nBackpack Covote [Swamp] - 56 IFZ\nBackpack Coyote [Mossy] - 58 IFZ\nBackpack Coyote [White] - 60 IFZ\nCamping Backpack - 64 IFZ\nTactical Backpack - 70 IFZ\nMilitary Backpack - 72 IFZ\nTiger Backpack - 75 IFZ\nMountaineer Backpack (Black) - 100 IFZ\nMountaineer Backpack (Camo) - 110 IFZ\nAlice Backpack - 150 IFZ\nField Backpack - 250 IFZ"

        binding.textStoreBackpacksData.text = backpacksData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

