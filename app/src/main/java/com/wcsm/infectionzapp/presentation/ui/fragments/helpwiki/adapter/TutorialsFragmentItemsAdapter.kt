package com.wcsm.infectionzapp.presentation.ui.fragments.helpwiki.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.TutorialsFragmentItemBinding
import com.wcsm.infectionzapp.presentation.model.TutorialItem
import com.wcsm.infectionzapp.presentation.ui.data.helpWikiTutorialsItems

class TutorialsFragmentItemsAdapter(
    private val onClick: (url: String) -> Unit
) : Adapter<TutorialsFragmentItemsAdapter.TutorialsFragmentItemsHolder>() {

    private val tutorialItems = helpWikiTutorialsItems

    inner class TutorialsFragmentItemsHolder(
        private val binding: TutorialsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(tutorialItem: TutorialItem) {
            binding.textTutorialsFragmentItemDescription.text = tutorialItem.description

            binding.btnTutorialsFragmentItem.setOnClickListener {
                onClick(tutorialItem.url)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TutorialsFragmentItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = TutorialsFragmentItemBinding.inflate(layoutInflater)
        return TutorialsFragmentItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: TutorialsFragmentItemsHolder, position: Int) {
        val tutorialItem = tutorialItems[position]
        holder.bind(tutorialItem)
    }

    override fun getItemCount(): Int {
        Log.i("#-# TESTE #-#", "getItemCount: ${tutorialItems.size}")
        return tutorialItems.size
    }

}