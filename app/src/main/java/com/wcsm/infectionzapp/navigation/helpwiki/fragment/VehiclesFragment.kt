package com.wcsm.infectionzapp.navigation.helpwiki.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.wcsm.infectionzapp.databinding.FragmentVehiclesBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.adapter.VehiclesFragmentItemsAdapter

class VehiclesFragment : Fragment() {

    private var _binding: FragmentVehiclesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVehiclesBinding.inflate(inflater, container, false)

        binding.rvHelpWikiVehicles.adapter = VehiclesFragmentItemsAdapter()
        binding.rvHelpWikiVehicles.layoutManager = GridLayoutManager(context, 2)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}