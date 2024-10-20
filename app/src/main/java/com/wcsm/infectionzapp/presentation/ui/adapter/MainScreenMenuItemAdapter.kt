package com.wcsm.infectionzapp.presentation.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.MainScreenMenuItemBinding
import com.wcsm.infectionzapp.presentation.model.MainScreenMenuItem
import com.wcsm.infectionzapp.presentation.ui.data.mainScreenNavigationItems

class MainScreenMenuItemAdapter(
    private val onClick: (navigationDestiny: AppCompatActivity) -> Unit
) : Adapter<MainScreenMenuItemAdapter.MainScreenMenuItemHolder>() {

    private val menuItems = mainScreenNavigationItems

    inner class MainScreenMenuItemHolder(
        private val binding: MainScreenMenuItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(menuItem: MainScreenMenuItem) {
            binding.textCardTitle.text = menuItem.menuItemTitle

            binding.cvMainScreenItem.setOnClickListener {
                onClick(menuItem.menuItemActivity)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainScreenMenuItemHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = MainScreenMenuItemBinding.inflate(layoutInflater, parent, false)
        return MainScreenMenuItemHolder(binding)
    }

    override fun onBindViewHolder(holder: MainScreenMenuItemHolder, position: Int) {
        val menuItem = menuItems[position]
        holder.bind(menuItem)
    }

    override fun getItemCount(): Int {
        return menuItems.size
    }
}