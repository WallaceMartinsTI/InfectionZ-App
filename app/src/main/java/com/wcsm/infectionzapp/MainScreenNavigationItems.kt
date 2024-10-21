package com.wcsm.infectionzapp

import com.wcsm.infectionzapp.navigation.bosses.BossesActivity
import com.wcsm.infectionzapp.navigation.helpwiki.HelpWikiActivity
import com.wcsm.infectionzapp.navigation.quests.QuestsActivity
import com.wcsm.infectionzapp.navigation.sales.SalesActivity
import com.wcsm.infectionzapp.navigation.server.ServerActivity
import com.wcsm.infectionzapp.navigation.store.StoreActivity

val mainScreenNavigationItems = listOf(
    MainScreenMenuItem("SERVIDOR", ServerActivity()),
    MainScreenMenuItem("BOSSES", BossesActivity()),
    MainScreenMenuItem("MISSÕES", QuestsActivity()),
    MainScreenMenuItem("AJUDA/WIKI", HelpWikiActivity()),
    MainScreenMenuItem("LOJINHA", StoreActivity()),
    MainScreenMenuItem("VENDAS", SalesActivity())
)