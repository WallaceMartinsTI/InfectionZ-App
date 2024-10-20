package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.MedicinesFragmentItemBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.model.MedicineItem
import com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiMedicinesItems

class MedicinesItemsAdapter : Adapter<MedicinesItemsAdapter.MedicinesFragmentItemsHolder>() {

    private val medicineItems =
        com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiMedicinesItems

    inner class MedicinesFragmentItemsHolder(
        private val binding: MedicinesFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(medicineItem: MedicineItem) {
            binding.textMedicinesFragmentItemName.text = medicineItem.name
            binding.textMedicinesFragmentItemTitle.text = medicineItem.title
            binding.textMedicinesFragmentItemDescription.text = medicineItem.description
            binding.ivMedicinesFragmentItem.setImageResource(medicineItem.imageResource)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MedicinesFragmentItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = MedicinesFragmentItemBinding.inflate(layoutInflater, parent, false)
        return MedicinesFragmentItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicinesFragmentItemsHolder, position: Int) {
        val medicineItem = medicineItems[position]
        holder.bind(medicineItem)
    }

    override fun getItemCount(): Int {
        return medicineItems.size
    }
}