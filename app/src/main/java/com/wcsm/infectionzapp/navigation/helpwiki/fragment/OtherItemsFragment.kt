package com.wcsm.infectionzapp.navigation.helpwiki.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.FragmentOtherItemsBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.adapter.OtherItemsItemsAdapter
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.utils.CustomDividerItemDecoration

class OtherItemsFragment : Fragment() {

    private var _binding: FragmentOtherItemsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOtherItemsBinding.inflate(inflater, container, false)

        binding.rvHelpWikiOtherItems.adapter = OtherItemsItemsAdapter()
        binding.rvHelpWikiOtherItems.layoutManager = LinearLayoutManager(context)

        val dividerHeight = 4
        val dividerWidth = 500
        val dividerColor = resources.getColor(R.color.primaryRed)
        binding.rvHelpWikiOtherItems.addItemDecoration(
            CustomDividerItemDecoration(dividerHeight, dividerColor, dividerWidth)
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}