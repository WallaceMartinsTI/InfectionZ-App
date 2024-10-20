package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.RareGearsFragmentItemBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.data.helpWikiRareGearsItems
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.model.RareGearsItem

class RareGearsItemsAdapter(
    private val onClick: (url: String) -> Unit
) : Adapter<RareGearsItemsAdapter.RareGearsFragmentItemHolder>() {

    private val rareGearsItems = helpWikiRareGearsItems

    inner class RareGearsFragmentItemHolder(
        private val binding: RareGearsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(rareGearsItem: RareGearsItem) {
            binding.textRareGearsFragmentItemDescription.text = rareGearsItem.description

            binding.btnRareGearsFragmentItem.setOnClickListener {
                onClick(rareGearsItem.url)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RareGearsFragmentItemHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RareGearsFragmentItemBinding.inflate(layoutInflater, parent, false)
        return RareGearsFragmentItemHolder(binding)
    }

    override fun onBindViewHolder(holder: RareGearsFragmentItemHolder, position: Int) {
        val rareGearsItem = rareGearsItems[position]
        holder.bind(rareGearsItem)
    }

    override fun getItemCount(): Int {
        return rareGearsItems.size
    }
}