package com.wcsm.infectionzapp

import com.wcsm.infectionzapp.navigation.bosses.BossesActivity
import com.wcsm.infectionzapp.navigation.helpwiki.HelpWikiActivity
import com.wcsm.infectionzapp.navigation.ItemsActivity
import com.wcsm.infectionzapp.navigation.quests.QuestsActivity
import com.wcsm.infectionzapp.navigation.SalesActivity
import com.wcsm.infectionzapp.navigation.server.ServerActivity
import com.wcsm.infectionzapp.navigation.StoreActivity

val mainScreenNavigationItems = listOf(
    MainScreenMenuItem("SERVIDOR", ServerActivity()),
    MainScreenMenuItem("BOSSES", BossesActivity()),
    MainScreenMenuItem("AJUDA/WIKI", HelpWikiActivity()),
    MainScreenMenuItem("VENDAS", SalesActivity()),
    MainScreenMenuItem("MISSÕES", QuestsActivity()),
    MainScreenMenuItem("ITENS", ItemsActivity()),
    MainScreenMenuItem("LOJINHA", StoreActivity()),
)