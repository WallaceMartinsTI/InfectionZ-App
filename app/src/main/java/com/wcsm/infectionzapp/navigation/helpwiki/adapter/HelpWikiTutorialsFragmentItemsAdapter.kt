package com.wcsm.infectionzapp.navigation.helpwiki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.TutorialsFragmentItemBinding
import com.wcsm.infectionzapp.navigation.helpwiki.model.HelpWikiTutorialItem
import com.wcsm.infectionzapp.navigation.helpwiki.data.helpWikiTutorialsItems

class HelpWikiTutorialsFragmentItemsAdapter(
    private val onClick: (url: String) -> Unit
) : Adapter<HelpWikiTutorialsFragmentItemsAdapter.TutorialsFragmentItemsHolder>() {

    private val tutorialItems = helpWikiTutorialsItems

    inner class TutorialsFragmentItemsHolder(
        private val binding: TutorialsFragmentItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(helpWikiTutorialItem: HelpWikiTutorialItem) {
            binding.textTutorialsFragmentItemDescription.text = helpWikiTutorialItem.description

            binding.btnTutorialsFragmentItem.setOnClickListener {
                onClick(helpWikiTutorialItem.url)
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
        return tutorialItems.size
    }

}