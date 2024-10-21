package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.VehiclePartsFragmentItemBinding
import com.wcsm.infectionzapp.navigation.helpwiki.model.HelpWikiVehiclePartsItem
import com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiHelpWikiVehiclePartsItems

class HelpWikiVehiclePartsItemsAdapter : Adapter<HelpWikiVehiclePartsItemsAdapter.VehiclePartsFragmentItemsHolder>() {

    private val vehiclePartsItems = helpWikiHelpWikiVehiclePartsItems

    inner class VehiclePartsFragmentItemsHolder(
        private val binding: VehiclePartsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(helpWikiVehiclePartsItem: HelpWikiVehiclePartsItem) {
            binding.textVehiclePartsFragmentItemName.text = helpWikiVehiclePartsItem.name
            binding.textVehiclePartsFragmentItemTitle.text = helpWikiVehiclePartsItem.title
            binding.textVehiclePartsFragmentItemDescription.text = helpWikiVehiclePartsItem.description
            binding.imVehiclePartsFragmentItem.setImageResource(helpWikiVehiclePartsItem.imageResource)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VehiclePartsFragmentItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = VehiclePartsFragmentItemBinding.inflate(layoutInflater)
        return VehiclePartsFragmentItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: VehiclePartsFragmentItemsHolder, position: Int) {
        val vehiclePartsItem = vehiclePartsItems[position]
        holder.bind(vehiclePartsItem)
    }

    override fun getItemCount(): Int {
        return vehiclePartsItems.size
    }

}