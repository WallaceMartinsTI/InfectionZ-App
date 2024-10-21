package com.wcsm.infectionzapp.navigation.bosses.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.BossItemBinding
import com.wcsm.infectionzapp.navigation.bosses.data.bossesItemsList
import com.wcsm.infectionzapp.navigation.bosses.model.BossItem

class BossesAdapter(
    private val onClick: (boss: BossItem) -> Unit
) : Adapter<BossesAdapter.BossesItemsHolder>() {

    private val bossesList = bossesItemsList

    inner class BossesItemsHolder(
        private val binding: BossItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(bossesItem: BossItem) {
            binding.textBossItemName.text = bossesItem.name
            binding.ivBossItem.setImageResource(bossesItem.bossImageResource)
            binding.clBossItem.setOnClickListener {
                onClick(bossesItem)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BossesItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = BossItemBinding.inflate(layoutInflater, parent, false)
        return BossesItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: BossesItemsHolder, position: Int) {
        val bossesItem = bossesList[position]
        holder.bind(bossesItem)
    }

    override fun getItemCount(): Int {
        return bossesList.size
    }
}