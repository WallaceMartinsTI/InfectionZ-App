package com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.VestsAndHelmetsFragmentItemBinding
import com.wcsm.infectionzapp.presentation.model.VestsAndHelmets
import com.wcsm.infectionzapp.presentation.ui.data.helpWikiVestsAndHelmets

class VestsAndHelmetsItemsAdapter : Adapter<VestsAndHelmetsItemsAdapter.VestsAndHelmetsItemsHolder>() {

    private val vestsAndHelmetsItems = helpWikiVestsAndHelmets

    inner class VestsAndHelmetsItemsHolder(
        private val binding: VestsAndHelmetsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(vestsAndHelmetsItem: VestsAndHelmets) {
            binding.textVestsAndHelmetsItemName.text = vestsAndHelmetsItem.name
            binding.textVestsAndHelmetsItemTitle.text = vestsAndHelmetsItem.title
            binding.textVestsAndHelmetsItemDescription.text = vestsAndHelmetsItem.description
            binding.textVestsAndHelmetsItemProtection.text = "Proteção: ${vestsAndHelmetsItem.protection}%"
            binding.ivVestsAndHelmetsItem.setImageResource(vestsAndHelmetsItem.imageResource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VestsAndHelmetsItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = VestsAndHelmetsFragmentItemBinding.inflate(layoutInflater, parent, false)
        return VestsAndHelmetsItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: VestsAndHelmetsItemsHolder, position: Int) {
        val vestsAndHelmetsItem = helpWikiVestsAndHelmets[position]
        holder.bind(vestsAndHelmetsItem)
    }

    override fun getItemCount(): Int {
        return vestsAndHelmetsItems.size
    }
}