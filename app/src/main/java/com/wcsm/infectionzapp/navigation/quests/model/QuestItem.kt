package com.wcsm.infectionzapp.navigation.quests.model

data class QuestItem(
    val title: String,
    val description: String,
    val requirements: String,
    val reward: String,
    val completed: Boolean
)