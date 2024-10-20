package com.wcsm.infectionzapp.navigation.helpwiki.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.FragmentMedicinesBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.adapter.MedicinesItemsAdapter
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.utils.CustomDividerItemDecoration

class MedicinesFragment : Fragment() {

    private var _binding: FragmentMedicinesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMedicinesBinding.inflate(inflater, container, false)

        binding.rvHelpWikiMedicines.adapter = MedicinesItemsAdapter()
        binding.rvHelpWikiMedicines.layoutManager = LinearLayoutManager(context)

        val dividerHeight = 4
        val dividerWidth = 500
        val dividerColor = resources.getColor(R.color.primaryRed)
        binding.rvHelpWikiMedicines.addItemDecoration(
            CustomDividerItemDecoration(dividerHeight, dividerColor, dividerWidth)
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}