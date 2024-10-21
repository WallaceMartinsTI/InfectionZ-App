package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.OtherItemsFragmentItemBinding
import com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiOtherItemsItems
import com.wcsm.infectionzapp.navigation.helpwiki.model.HelpWikiOtherItemItem

class HelpWikiOtherItemsItemsAdapter : Adapter<HelpWikiOtherItemsItemsAdapter.OtherItemsFragmentItemsHolder>() {

    private val otherItemsItems = helpWikiOtherItemsItems

    inner class OtherItemsFragmentItemsHolder(
        private val binding: OtherItemsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(helpWikiOtherItemItem: HelpWikiOtherItemItem) {
            binding.textOtherItemsFragmentItemName.text = helpWikiOtherItemItem.name
            binding.textOtherItemsFragmentItemTitle.text = helpWikiOtherItemItem.title
            binding.textOtherItemsFragmentItemDescription.text = helpWikiOtherItemItem.description
            binding.ivOtherItemsFragmentItem.setImageResource(helpWikiOtherItemItem.imageResource)
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