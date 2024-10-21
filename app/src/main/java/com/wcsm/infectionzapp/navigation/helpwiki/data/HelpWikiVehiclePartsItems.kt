package com.wcsm.infectionzapp.navigation.helpwiki.data

import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.navigation.helpwiki.model.HelpWikiVehiclePartsItem

val helpWikiHelpWikiVehiclePartsItems = listOf(
    HelpWikiVehiclePartsItem(
        name = "Engine",
        title = "Motor | peça de veículo",
        description = "Descrição: Usado para montar veículos\nNecessário: Toolbox (caixa de ferramentas)",
        imageResource = R.drawable.engine
    ),
    HelpWikiVehiclePartsItem(
        name = "Tank Parts",
        title = "Tanque de Gasolina | peça de veículo",
        description = "Descrição: Usado para montar veículos\nNecessário: Toolbox (caixa de ferramentas",
        imageResource = R.drawable.tank_parts
    ),
    HelpWikiVehiclePartsItem(
        name = "Tire",
        title = "Pneu | peça de veículo",
        description = "Descrição: Usado para montar veículos\\nNecessário: Toolbox (caixa de ferramentas\"",
        imageResource = R.drawable.tire
    ),
    HelpWikiVehiclePartsItem(
        name = "Empty Gas Canister",
        title = "Galão de Gasolina Vazio | peça de veículo",
        description = "Descrição: Usado para pegar gasolina em postos de combustível",
        imageResource = R.drawable.empty_gas_can
    ),
    HelpWikiVehiclePartsItem(
        name = "Full Gas Canister",
        title = "Galão de Gasolina Cheio | peça de veículo",
        description = "Descrição: Usado para abastecer veículos",
        imageResource = R.drawable.full_gas_can
    ),
    HelpWikiVehiclePartsItem(
        name = "Steel Sheet",
        title = "Placa de Metal | peça de veículo",
        description = "Descrição: Usado para blindagem de veículos. Ao ser colocado no carro, adiciona uma \"vida extra\" ao veículo.\nNecessário: Toolbox (caixa de ferramentas)",
        imageResource = R.drawable.steel_sheet
    )
)