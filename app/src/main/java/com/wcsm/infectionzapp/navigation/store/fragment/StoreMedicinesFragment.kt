package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreMedicinesBinding

class StoreMedicinesFragment : Fragment() {

    private var _binding: FragmentStoreMedicinesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreMedicinesBinding.inflate(inflater, container, false)

        val medicinesData = "Bandage - 4 IFZ\nMedic Kit - 10 IFZ\nMedic Kit MIL - 20 IFZ\nPainkiller - 6 IFZ\nAntibiotic - 6 IFZ\nMorphine - 6 IFZ\nBlood Bag - 8 IFZ\nHeat Pack - 5 IFZ\nInjection IF-Z - 500 IFZ\nInjection Hulk-Z - 2000 IFZ\nAnabolic Steroid - 40 IFZ\nCalorie Vitamin - 40 IFZ"

        binding.textStoreMedicinesData.text = medicinesData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
