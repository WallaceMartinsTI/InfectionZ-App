package com.wcsm.infectionzapp.presentation.ui.data

import com.wcsm.infectionzapp.R
import com.wcsm.infectionzapp.presentation.model.MedicineItem

val helpWikiMedicinesItems = listOf(
    MedicineItem(
        name = "Bandage",
        title = "Bandagem",
        description = "Descrição: Usada para estancar sangramentos",
        imageResource = R.drawable.bandagem
    ),
    MedicineItem(
        name = "Painkiller",
        title = "Analgésicos",
        description = "Descrição: Usado para curar dores de cabeça",
        imageResource = R.drawable.painkiller
    ),
    MedicineItem(
        name = "Morphine",
        title = "Morfina",
        description = "Descrição: Usada para curar fraturas e ossos quebrados",
        imageResource = R.drawable.morphine
    ),
    MedicineItem(
        name = "Antibiotic",
        title = "Antibióticos",
        description = "Descrição: Usado para curar infecções de Zumbis",
        imageResource = R.drawable.antibiotic
    ),
    MedicineItem(
        name = "Blood Bag",
        title = "Bolsa de Sangue",
        description = "Descrição: Usada para curar +3.000 de Blood",
        imageResource = R.drawable.blood_bag
    ),
    MedicineItem(
        name = "Medic Kit",
        title = "Kit Médico",
        description = "Descrição: Usada para curar +7.000 de Blood\nTambém cura sangramentos e dores de cabeça",
        imageResource = R.drawable.medic_kit
    ),
    MedicineItem(
        name = "Medic Kit MIL",
        title = "Kit Médico Completo",
        description = "Descrição: Usada para curar +9.000 de Blood\nTambém cura sangramentos, dores de cabeça, fraturas, ossos quebrados e infecções de Zumbis",
        imageResource = R.drawable.medic_kit_mil
    ),
    MedicineItem(
        name = "Heat Pack",
        title = "Bolsa Térmica de Calor",
        description = "Descrição: Usada para aumentar sua temperatura corporal",
        imageResource = R.drawable.heat_pack
    ),
    MedicineItem(
        name = "Calorie Vitamin",
        title = "Vitaminas Calóricas",
        description = "Descrição: Usada para aumentar sua gordura",
        imageResource = R.drawable.calorie_vitamin
    ),
    MedicineItem(
        name = "Anabolic Steroid",
        title = "Anabolizantes",
        description = "Descrição: Usado para aumentar seus músculos\nObs: Deixa seu personagem musculoso, porém com um pouco mais de Blood",
        imageResource = R.drawable.anabolic_steroid
    ),
    MedicineItem(
        name = "Injection IF-Z",
        title = "Injeção IF-Z",
        description = "Item extremamente raro.\nDescrição: Usada para aumentar seu Blood para 18.000\nTambém cura todas as suas doenças",
        imageResource = R.drawable.injection_ifz
    ),
    MedicineItem(
        name = "Injection Hul-Z",
        title = "Injeção Hulk-Z",
        description = "Item extremamente raro.\nDescrição: Usada para aumentar seu Blood para 20.000\nTambém cura todas as suas doenças",
        imageResource = R.drawable.injection_hulkz
    )
)