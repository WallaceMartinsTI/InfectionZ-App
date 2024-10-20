package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.VehiclePartsFragmentItemBinding
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.model.VehiclePartsItem
import com.wcsm.infectionzapp.presentation.ui.navigation.helpwiki.data.helpWikiVehiclePartsItems

class VehiclePartsItemsAdapter : Adapter<VehiclePartsItemsAdapter.VehiclePartsFragmentItemsHolder>() {

    private val vehiclePartsItems = helpWikiVehiclePartsItems

    inner class VehiclePartsFragmentItemsHolder(
        private val binding: VehiclePartsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(vehiclePartsItem: VehiclePartsItem) {
            binding.textVehiclePartsFragmentItemName.text = vehiclePartsItem.name
            binding.textVehiclePartsFragmentItemTitle.text = vehiclePartsItem.title
            binding.textVehiclePartsFragmentItemDescription.text = vehiclePartsItem.description
            binding.imVehiclePartsFragmentItem.setImageResource(vehiclePartsItem.imageResource)
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