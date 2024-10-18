package com.wcsm.infectionzapp.presentation.ui.data

import com.wcsm.infectionzapp.presentation.model.MainScreenMenuItem
import com.wcsm.infectionzapp.presentation.ui.navigation.BossesActivity
import com.wcsm.infectionzapp.presentation.ui.navigation.HelpWikiActivity
import com.wcsm.infectionzapp.presentation.ui.navigation.ItemsActivity
import com.wcsm.infectionzapp.presentation.ui.navigation.QuestsActivity
import com.wcsm.infectionzapp.presentation.ui.navigation.SalesActivity
import com.wcsm.infectionzapp.presentation.ui.navigation.ServerActivity
import com.wcsm.infectionzapp.presentation.ui.navigation.StoreActivity

val mainScreenNavigationItems = listOf(
    MainScreenMenuItem("SERVIDOR", ServerActivity()),
    MainScreenMenuItem("BOSSES", BossesActivity()),
    MainScreenMenuItem("AJUDA/WIKI", HelpWikiActivity()),
    MainScreenMenuItem("VENDAS", SalesActivity()),
    MainScreenMenuItem("MISSÕES", QuestsActivity()),
    MainScreenMenuItem("ITENS", ItemsActivity()),
    MainScreenMenuItem("LOJINHA", StoreActivity()),
)