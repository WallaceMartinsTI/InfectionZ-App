package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.MedicinesFragmentItemBinding
import com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiMedicinesItems
import com.wcsm.infectionzapp.navigation.helpwiki.model.HelpWikiMedicineItem

class HelpWikiMedicinesItemsAdapter : Adapter<HelpWikiMedicinesItemsAdapter.MedicinesFragmentItemsHolder>() {

    private val medicineItems = helpWikiMedicinesItems

    inner class MedicinesFragmentItemsHolder(
        private val binding: MedicinesFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(helpWikiMedicineItem: HelpWikiMedicineItem) {
            binding.textMedicinesFragmentItemName.text = helpWikiMedicineItem.name
            binding.textMedicinesFragmentItemTitle.text = helpWikiMedicineItem.title
            binding.textMedicinesFragmentItemDescription.text = helpWikiMedicineItem.description
            binding.ivMedicinesFragmentItem.setImageResource(helpWikiMedicineItem.imageResource)
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