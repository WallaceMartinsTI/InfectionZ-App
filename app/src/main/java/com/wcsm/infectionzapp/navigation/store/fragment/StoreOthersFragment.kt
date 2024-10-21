package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreOthersBinding

class StoreOthersFragment : Fragment() {

    private var _binding: FragmentStoreOthersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreOthersBinding.inflate(inflater, container, false)

        val othersData = "Engine - 30 IFZ\nTire - 15 IFZ\nTank Parts - 25 IFZ\nFull Gas Canister - 15 IFZ\nToolbox - 20\nSteel Sheet - 10 IFZ\nDiver Suit - 800 IFZ\nHazmat Suit - 3000 IFZ\nBox Key - 500 IFZ\nTurtle Key - 3000 IFZ\nIFZ Christmas Box - 2000 IFZ\nMilitary Card (Area 51) - 500 IFZ\nMilitary Card (Area 69) - 2000 IFZ\nMilitary Card (Underground LS) - 2000 IFZ\nMilitary Card (Ship SF) - 1500 IFZ\nTent - 120 IFZ"

        binding.textStoreOthersData.text = othersData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

