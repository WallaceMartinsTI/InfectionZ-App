package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.VestsAndHelmetsFragmentItemBinding
import com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiVestsAndHelmetItems
import com.wcsm.infectionzapp.navigation.helpwiki.model.VestsAndHelmetsItem

class VestsAndHelmetsItemsAdapter : Adapter<VestsAndHelmetsItemsAdapter.VestsAndHelmetsItemsHolder>() {

    private val vestsAndHelmetsItems = helpWikiVestsAndHelmetItems

    inner class VestsAndHelmetsItemsHolder(
        private val binding: VestsAndHelmetsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(vestsAndHelmetsItem: VestsAndHelmetsItem) {
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
        val vestsAndHelmetsItem = helpWikiVestsAndHelmetItems[position]
        holder.bind(vestsAndHelmetsItem)
    }

    override fun getItemCount(): Int {
        return vestsAndHelmetsItems.size
    }
}