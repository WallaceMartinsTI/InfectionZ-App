package com.wcsm.infectionzapp.presentation.ui.data

import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.presentation.model.VehiclePartsItem

val helpWikiVehiclePartsItems = listOf(
    VehiclePartsItem(
        name = "Engine",
        title = "Motor | peça de veículo",
        description = "Descrição: Usado para montar veículos\nNecessário: Toolbox (caixa de ferramentas)",
        imageResource = R.drawable.engine
    ),
    VehiclePartsItem(
        name = "Tank Parts",
        title = "Tanque de Gasolina | peça de veículo",
        description = "Descrição: Usado para montar veículos\nNecessário: Toolbox (caixa de ferramentas",
        imageResource = R.drawable.tank_parts
    ),
    VehiclePartsItem(
        name = "Tire",
        title = "Pneu | peça de veículo",
        description = "Descrição: Usado para montar veículos\\nNecessário: Toolbox (caixa de ferramentas\"",
        imageResource = R.drawable.tire
    ),
    VehiclePartsItem(
        name = "Empty Gas Canister",
        title = "Galão de Gasolina Vazio | peça de veículo",
        description = "Descrição: Usado para pegar gasolina em postos de combustível",
        imageResource = R.drawable.empty_gas_can
    ),
    VehiclePartsItem(
        name = "Full Gas Canister",
        title = "Galão de Gasolina Cheio | peça de veículo",
        description = "Descrição: Usado para abastecer veículos",
        imageResource = R.drawable.full_gas_can
    ),
    VehiclePartsItem(
        name = "Steel Sheet",
        title = "Placa de Metal | peça de veículo",
        description = "Descrição: Usado para blindagem de veículos. Ao ser colocado no carro, adiciona uma \"vida extra\" ao veículo.\nNecessário: Toolbox (caixa de ferramentas)",
        imageResource = R.drawable.steel_sheet
    )
)