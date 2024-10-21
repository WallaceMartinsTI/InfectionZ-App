package com.wcsm.infectionzapp.navigation.helpwiki.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.FragmentHelpwikiVehiclePartsBinding
import com.wcsm.infectionzapp.navigation.helpwiki.adapter.HelpWikiVehiclePartsItemsAdapter
import com.wcsm.infectionzapp.navigation.helpwiki.utils.HelpWikiCustomDividerItemDecoration

class HelpWikiVehiclePartsFragment : Fragment() {

    private var _binding: FragmentHelpwikiVehiclePartsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHelpwikiVehiclePartsBinding.inflate(inflater, container, false)

        binding.rvHelpWikiVehicleParts.adapter = HelpWikiVehiclePartsItemsAdapter()
        binding.rvHelpWikiVehicleParts.layoutManager = LinearLayoutManager(context)

        val dividerHeight = 4
        val dividerWidth = 500
        val dividerColor = resources.getColor(R.color.primaryRed)
        binding.rvHelpWikiVehicleParts.addItemDecoration(
            HelpWikiCustomDividerItemDecoration(dividerHeight, dividerColor, dividerWidth)
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}