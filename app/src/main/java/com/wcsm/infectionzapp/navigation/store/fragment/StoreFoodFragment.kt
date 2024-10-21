package com.wcsm.infectionzapp.navigation.store.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wcsm.infectionzapp.databinding.FragmentStoreFoodBinding

class StoreFoodFragment : Fragment() {

    private var _binding: FragmentStoreFoodBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoreFoodBinding.inflate(inflater, container, false)

        val foodData = "Canned Spaghetti - 5 IFZ\nCanned Baked Beans - 5 IFZ\nCanned Sardines - 5 IFZ\nCooked Meat - 8 IFZ\nWater Bottle - 8 IFZ\nSoda Sprite - 5 IFZ\nCoca-Cola - 5 IFZ\nMRE - 10 IFZ"

        binding.textStoreFoodData.text = foodData

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

