package com.wcsm.infectionzapp.navigation.helpwiki.fragment

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wcsm.infectionzapp.databinding.FragmentTutorialsBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.adapter.TutorialsFragmentItemsAdapter

class TutorialsFragment : Fragment() {

    private var _binding: FragmentTutorialsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTutorialsBinding.inflate(inflater, container, false)

        binding.rvHelpWikiTutorials.adapter = TutorialsFragmentItemsAdapter { url ->
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
                setPackage("com.google.android.youtube")
            }

            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(browserIntent)
            }
        }

        binding.rvHelpWikiTutorials.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}