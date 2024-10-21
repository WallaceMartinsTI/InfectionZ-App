package com.wcsm.infectionzapp.navigation.sales.skinsclan.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.SalesSkinClanItemBinding
import com.wcsm.infectionzapp.navigation.sales.skinsclan.data.SalesSkinClanItems
import com.wcsm.infectionzapp.navigation.sales.skinsclan.model.SalesSkinClanItem

class SalesSkinClanAdapter : Adapter<SalesSkinClanAdapter.SalesSkinClanItemsHolder>() {

    private val skinClanList = SalesSkinClanItems

    inner class SalesSkinClanItemsHolder(
        private val binding: SalesSkinClanItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(salesItem: SalesSkinClanItem) {
            binding.textSalesSkinClanId.text = "SKIN: ${salesItem.skinID}"
            binding.textSalesSkinClanPrice.text = "Preço: R$${salesItem.price} reais"
            binding.ivSalesSkinClan.setImageResource(salesItem.imageResource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SalesSkinClanItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = SalesSkinClanItemBinding.inflate(layoutInflater, parent, false)
        return SalesSkinClanItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: SalesSkinClanItemsHolder, position: Int) {
        val skinClanItem = skinClanList[position]
        holder.bind(skinClanItem)
    }

    override fun getItemCount(): Int {
        return skinClanList.size
    }
}