package com.wcsm.infectionzapp.navigation.bosses.model

data class BossItem(
    val name: String,
    val description: String,
    val life: String,
    val bossImageResource: Int,
    val location: String,
    val respawnTime: String,
    val bossLocationImage1Resouce: Int,
    val bossLocationImage2Resouce: Int
)
