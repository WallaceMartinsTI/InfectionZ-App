package com.wcsm.infectionzapp.navigation.helpwiki.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.wcsm.infectionzapp.databinding.FragmentHelpwikiVehiclesBinding
import com.wcsm.infectionzapp.navigation.helpwiki.adapter.HelpWikiVehiclesFragmentItemsAdapter

class HelpWikiVehiclesFragment : Fragment() {

    private var _binding: FragmentHelpwikiVehiclesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHelpwikiVehiclesBinding.inflate(inflater, container, false)

        binding.rvHelpWikiVehicles.adapter = HelpWikiVehiclesFragmentItemsAdapter()
        binding.rvHelpWikiVehicles.layoutManager = GridLayoutManager(context, 2)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}