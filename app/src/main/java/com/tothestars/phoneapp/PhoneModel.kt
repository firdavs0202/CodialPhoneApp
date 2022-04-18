package com.tothestars.phoneapp

data class PhoneModel(
    val model: String,
    val year: Int,
    val os: String,
    val chipset: String,
    val ram: String,
    val storage: String,
    val weight: Int,
    val displayType: String,
    val displaySize: Double,
    val displayResolution: String,
    val battery: Int,
    val price: Double,
)