package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreVestsBinding

class StoreVestsFragment : Fragment() {

    private var _binding: FragmentStoreVestsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreVestsBinding.inflate(inflater, container, false)

        val vestsData = "Police Vest - 35 IFZ\nPress Vest - 35 IFZ\nPress Winter Vest - 35 IFZ\nBalanced Vest - 42 IFZ\nBalistic Vest - 50 IFZ\nBalistic Winter Vest - 50 IFZ\nBalistic Plus Vest - 140 IFZ\nMilitary Pink Vest - 80\nMilitary Black Vest - 80\nMilitary Vest - 65 IFZ\nMilitary Plus Vest - 150 IFZ\nBone Vest - 500 IFZ\nTactical Vest - 650 IFZ\nUK Vest - 40 IFZ"

        binding.textStoreVestsData.text = vestsData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

