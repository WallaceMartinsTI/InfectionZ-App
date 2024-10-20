package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.LevelsFragmentItemBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.model.LevelItem
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.data.helpWikiLevelsItems

class LevelsItemsAdapter : Adapter<LevelsItemsAdapter.LevelsFragmentItemsHolder>() {

    private val levelsItems = helpWikiLevelsItems

    inner class LevelsFragmentItemsHolder(
        private val binding: LevelsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(levelItem: LevelItem) {
            val level = if(levelItem.level == 13) {
                levelItem.level.toString().padStart(2, '0') + "+"
            } else {
                levelItem.level.toString().padStart(2, '0')
            }
            binding.textLevelsFragmentItemLevel.text = "» LEVEL: $level"
            binding.textLevelsFragmentItemEquipments.text = levelItem.equipments
            binding.textLevelsFragmentItemUnlock.text = levelItem.unlock
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelsFragmentItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LevelsFragmentItemBinding.inflate(layoutInflater, parent, false)
        return LevelsFragmentItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: LevelsFragmentItemsHolder, position: Int) {
        val levelItem = levelsItems[position]
        holder.bind(levelItem)
    }

    override fun getItemCount(): Int {
        return levelsItems.size
    }
}