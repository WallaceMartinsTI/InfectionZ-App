package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreHelmetsBinding

class StoreHelmetsFragment : Fragment() {

    private var _binding: FragmentStoreHelmetsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreHelmetsBinding.inflate(inflater, container, false)

        val helmetsData = "Motorbike Helmet 1 - 15 IFZ\nMotorbike Helmet 2 - 15 IFZ\nMotorbike Helmet 3 - 15 IFZ\nMotorbike Helmet 4 - 15 IFZ\nMich Helmet - 35 IFZ\nSsh68 Helmet - 35 IFZ\nHelmet Tactical - 35 IFZ\nMilitary Helmet - 35 IFZ\nHelmet - 40 IFZWinter Helmet - 40 IFZ\nMossy Helmet - 70 IFZ\nMossy Pink Helmet - 80 IFZ\nMossy Winter Helmet - 100 IFZ\nBalistic Helmet - 650 IFZ\nUK Mossy Helmet - 70 IFZ\nBone Helmet - 500 IFZ"

        binding.textStoreHelmetsData.text = helmetsData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

