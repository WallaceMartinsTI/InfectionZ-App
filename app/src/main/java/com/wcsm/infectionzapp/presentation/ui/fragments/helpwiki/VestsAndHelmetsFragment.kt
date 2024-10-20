package com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.FragmentVestsAndHelmetsBinding
import com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.adapter.VestsAndHelmetsItemsAdapter
import com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.utils.CustomDividerItemDecoration

class VestsAndHelmetsFragment : Fragment() {

    private var _binding: FragmentVestsAndHelmetsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVestsAndHelmetsBinding.inflate(inflater, container, false)

        binding.rvHelpWikiVestsAndHelmets.adapter = VestsAndHelmetsItemsAdapter()
        binding.rvHelpWikiVestsAndHelmets.layoutManager = LinearLayoutManager(context)

        val dividerHeight = 4
        val dividerWidth = 500
        val dividerColor = resources.getColor(R.color.primaryRed)
        binding.rvHelpWikiVestsAndHelmets.addItemDecoration(
            CustomDividerItemDecoration(dividerHeight, dividerColor, dividerWidth)
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}