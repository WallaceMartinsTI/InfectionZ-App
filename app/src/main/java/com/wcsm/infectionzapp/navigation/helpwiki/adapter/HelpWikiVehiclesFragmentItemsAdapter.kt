package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.VehiclesFragmentItemBinding
import com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiVehiclesItems
import com.wcsm.infectionzapp.navigation.helpwiki.model.HelpWikiVehicleItem

class HelpWikiVehiclesFragmentItemsAdapter : Adapter<HelpWikiVehiclesFragmentItemsAdapter.VehiclesFragmentItemsHolder>() {

    private val vehicleItems = helpWikiVehiclesItems

    inner class VehiclesFragmentItemsHolder(
        private val binding: VehiclesFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(helpWikiVehicleItem: HelpWikiVehicleItem) {
            binding.textVehicleFragmentItemVehicle.text = helpWikiVehicleItem.vehicle
            binding.ivVehicleFragmentItem.setImageResource(helpWikiVehicleItem.imageResource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehiclesFragmentItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = VehiclesFragmentItemBinding.inflate(layoutInflater, parent, false)
        return VehiclesFragmentItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: VehiclesFragmentItemsHolder, position: Int) {
        val vehicleItem = vehicleItems[position]
        holder.bind(vehicleItem)
    }

    override fun getItemCount(): Int {
        return vehicleItems.size
    }
}