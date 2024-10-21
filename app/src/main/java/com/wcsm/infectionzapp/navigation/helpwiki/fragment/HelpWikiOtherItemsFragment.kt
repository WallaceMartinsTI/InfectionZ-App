package com.wcsm.infectionzapp.navigation.helpwiki.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.databinding.FragmentHelpwikiOtherItemsBinding
import com.wcsm.infectionzapp.navigation.helpwiki.adapter.HelpWikiOtherItemsItemsAdapter
import com.wcsm.infectionzapp.navigation.helpwiki.utils.HelpWikiCustomDividerItemDecoration

class HelpWikiOtherItemsFragment : Fragment() {

    private var _binding: FragmentHelpwikiOtherItemsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHelpwikiOtherItemsBinding.inflate(inflater, container, false)

        binding.rvHelpWikiOtherItems.adapter = HelpWikiOtherItemsItemsAdapter()
        binding.rvHelpWikiOtherItems.layoutManager = LinearLayoutManager(context)

        val dividerHeight = 4
        val dividerWidth = 500
        val dividerColor = resources.getColor(R.color.primaryRed)
        binding.rvHelpWikiOtherItems.addItemDecoration(
            HelpWikiCustomDividerItemDecoration(dividerHeight, dividerColor, dividerWidth)
        )

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}