package com.wcsm.infectionzapp.navigation.helpwiki.data

import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.navigation.helpwiki.model.HelpWikiMedicineItem

val helpWikiMedicinesItems = listOf(
    HelpWikiMedicineItem(
        name = "Bandage",
        title = "Bandagem",
        description = "Descrição: Usada para estancar sangramentos",
        imageResource = R.drawable.bandagem
    ),
    HelpWikiMedicineItem(
        name = "Painkiller",
        title = "Analgésicos",
        description = "Descrição: Usado para curar dores de cabeça",
        imageResource = R.drawable.painkiller
    ),
    HelpWikiMedicineItem(
        name = "Morphine",
        title = "Morfina",
        description = "Descrição: Usada para curar fraturas e ossos quebrados",
        imageResource = R.drawable.morphine
    ),
    HelpWikiMedicineItem(
        name = "Antibiotic",
        title = "Antibióticos",
        description = "Descrição: Usado para curar infecções de Zumbis",
        imageResource = R.drawable.antibiotic
    ),
    HelpWikiMedicineItem(
        name = "Blood Bag",
        title = "Bolsa de Sangue",
        description = "Descrição: Usada para curar +3.000 de Blood",
        imageResource = R.drawable.blood_bag
    ),
    HelpWikiMedicineItem(
        name = "Medic Kit",
        title = "Kit Médico",
        description = "Descrição: Usada para curar +7.000 de Blood\nTambém cura sangramentos e dores de cabeça",
        imageResource = R.drawable.medic_kit
    ),
    HelpWikiMedicineItem(
        name = "Medic Kit MIL",
        title = "Kit Médico Completo",
        description = "Descrição: Usada para curar +9.000 de Blood\nTambém cura sangramentos, dores de cabeça, fraturas, ossos quebrados e infecções de Zumbis",
        imageResource = R.drawable.medic_kit_mil
    ),
    HelpWikiMedicineItem(
        name = "Heat Pack",
        title = "Bolsa Térmica de Calor",
        description = "Descrição: Usada para aumentar sua temperatura corporal",
        imageResource = R.drawable.heat_pack
    ),
    HelpWikiMedicineItem(
        name = "Calorie Vitamin",
        title = "Vitaminas Calóricas",
        description = "Descrição: Usada para aumentar sua gordura",
        imageResource = R.drawable.calorie_vitamin
    ),
    HelpWikiMedicineItem(
        name = "Anabolic Steroid",
        title = "Anabolizantes",
        description = "Descrição: Usado para aumentar seus músculos\nObs: Deixa seu personagem musculoso, porém com um pouco mais de Blood",
        imageResource = R.drawable.anabolic_steroid
    ),
    HelpWikiMedicineItem(
        name = "Injection IF-Z",
        title = "Injeção IF-Z",
        description = "Item extremamente raro.\nDescrição: Usada para aumentar seu Blood para 18.000\nTambém cura todas as suas doenças",
        imageResource = R.drawable.injection_ifz
    ),
    HelpWikiMedicineItem(
        name = "Injection Hul-Z",
        title = "Injeção Hulk-Z",
        description = "Item extremamente raro.\nDescrição: Usada para aumentar seu Blood para 20.000\nTambém cura todas as suas doenças",
        imageResource = R.drawable.injection_hulkz
    )
)