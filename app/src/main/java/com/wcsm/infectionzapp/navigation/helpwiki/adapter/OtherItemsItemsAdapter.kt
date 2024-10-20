package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.OtherItemsFragmentItemBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.data.helpWikiOtherItemsItems
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.model.OtherItemItem

class OtherItemsItemsAdapter : Adapter<OtherItemsItemsAdapter.OtherItemsFragmentItemsHolder>() {

    private val otherItemsItems = helpWikiOtherItemsItems

    inner class OtherItemsFragmentItemsHolder(
        private val binding: OtherItemsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(otherItemItem: OtherItemItem) {
            binding.textOtherItemsFragmentItemName.text = otherItemItem.name
            binding.textOtherItemsFragmentItemTitle.text = otherItemItem.title
            binding.textOtherItemsFragmentItemDescription.text = otherItemItem.description
            binding.ivOtherItemsFragmentItem.setImageResource(otherItemItem.imageResource)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OtherItemsFragmentItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = OtherItemsFragmentItemBinding.inflate(layoutInflater, parent, false)
        return OtherItemsFragmentItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: OtherItemsFragmentItemsHolder, position: Int) {
        val otherItemItem = otherItemsItems[position]
        holder.bind(otherItemItem)
    }

    override fun getItemCount(): Int {
        return otherItemsItems.size
    }
}