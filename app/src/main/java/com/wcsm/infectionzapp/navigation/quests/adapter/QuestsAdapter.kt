package com.wcsm.infectionzapp.navigation.quests.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.wcsm.infectionzapp.databinding.QuestItemBinding
import com.wcsm.infectionzapp.navigation.quests.model.QuestItem

class QuestsAdapter(
    private val questsList: List<QuestItem>,
    private val getQuestsStatusMap: () -> Map<String, Boolean>,
    private val onCheckedChangeListener: (questItem: QuestItem, isChecked: Boolean) -> Unit
) : Adapter<QuestsAdapter.QuestsItemsHolder>() {

    inner class QuestsItemsHolder(
        private val binding: QuestItemBinding
    ) : ViewHolder(binding.root) {
        fun bind(questItem: QuestItem) {
            binding.textQuestItemTitle.text = questItem.title
            binding.textQuestItemDescription.text = questItem.description
            binding.textQuestItemRequirements.text = questItem.requirements
            binding.textQuestItemReward.text = questItem.reward

            val questsStatusMap = getQuestsStatusMap()
            val isCompleted = questsStatusMap[questItem.title] ?: questItem.completed
            binding.cbQuestsCompleted.isChecked = isCompleted

            binding.cbQuestsCompleted.setOnCheckedChangeListener { buttonView, isChecked ->
                onCheckedChangeListener(questItem, isChecked)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestsItemsHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = QuestItemBinding.inflate(layoutInflater, parent, false)
        return QuestsItemsHolder(binding)
    }

    override fun onBindViewHolder(holder: QuestsItemsHolder, position: Int) {
        val questItem = questsList[position]
        holder.bind(questItem)
    }

    override fun getItemCount(): Int {
        return questsList.size
    }
}