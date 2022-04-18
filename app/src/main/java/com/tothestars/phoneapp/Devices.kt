package com.tothestars.phoneapp

object Devices {
    private val apple = listOf(
        PhoneModel(
            "iPhone 13 Pro Max",
            2021,
            "iOS 15",
            "Apple A15 Bionic",
            "6",
            "128/256/512/1024 Gb",
            240,
            "Super Retina XDR OLED 120Hz",
            6.7,
            "2K",
            4353,
            1099.0
        ),
        PhoneModel(
            "iPhone 13 Pro",
            2021,
            "iOS 15",
            "Apple A15 Bionic",
            "6",
            "128/256/512/1024 Gb",
            204,
            "Super Retina XDR OLED 120Hz",
            6.1,
            "Full HD",
            3095,
            999.0
        ),
        PhoneModel(
            "iPhone 13",
            2021,
            "iOS 15",
            "Apple A15 Bionic",
            "4",
            "128/256/512 Gb",
            174,
            "Super Retina XDR OLED",
            6.1,
            "Full HD",
            3240,
            728.99
        ),
        PhoneModel(
            "iPhone 13 mini",
            2021,
            "iOS 15",
            "Apple A15 Bionic",
            "4",
            "128/256/512 Gb",
            141,
            "Super Retina XDR OLED",
            5.4,
            "Full HD",
            2438,
            645.00
        ),
        PhoneModel(
            "iPhone SE (2022)",
            2022,
            "iOS 15.4",
            "Apple A15 Bionic",
            "4",
            "64/128/256 Gb",
            144,
            "Retina IPS LCD",
            4.7,
            "HD",
            2018,
            430.00
        ),
        PhoneModel(
            "iPhone SE (2020)",
            2020,
            "iOS 13",
            "Apple A13 Bionic",
            "3",
            "64/128/256 Gb",
            148,
            "Retina IPS LCD",
            4.7,
            "HD",
            1821,
            219.99
        ),
        PhoneModel(
            "iPhone 12 Pro Max",
            2020,
            "iOS 14",
            "Apple A14 Bionic",
            "6",
            "128/256/512 Gb",
            228,
            "Super Retina XDR OLED",
            6.7,
            "2K",
            3687,
            980.0
        ),
        PhoneModel(
            "iPhone 12 Pro",
            2020,
            "iOS 14",
            "Apple A14 Bionic",
            "6",
            "128/256/512 Gb",
            189,
            "Super Retina XDR OLED",
            6.1,
            "Full HD",
            2815,
            850.0
        ),
        PhoneModel(
            "iPhone 12",
            2020,
            "iOS 14",
            "Apple A14 Bionic",
            "4",
            "64/128/256 Gb",
            164,
            "Super Retina XDR OLED",
            6.1,
            "Full HD",
            2815,
            585.0
        ),
        PhoneModel(
            "iPhone 12 mini",
            2020,
            "iOS 14",
            "Apple A14 Bionic",
            "4",
            "64/128/256 Gb",
            135,
            "Super Retina XDR OLED",
            5.4,
            "Full HD",
            2227,
            429.0
        ),
    )
    private val xiaomi = listOf(
        PhoneModel(
            "12X",
            2021,
            "Android 11",
            "Qualcomm Snapdragon 870",
            "8/12",
            "128/256 Gb",
            176,
            "AMOLED",
            6.28,
            "Full HD",
            4500,
            500.00
        ),
        PhoneModel(
            "12",
            2021,
            "Android 12",
            "Qualcomm Snapdragon 8 Gen 1",
            "8/12",
            "128/256 Gb",
            179,
            "AMOLED",
            6.28,
            "Full HD",
            4500,
            750.00
        ),
        PhoneModel(
            "12 Pro",
            2021,
            "Android 12",
            "Qualcomm Snapdragon 8 Gen 1",
            "8/12",
            "128/256 Gb",
            204,
            "AMOLED",
            6.73,
            "2K",
            4600,
            1000.00
        ),
    )

    private val samsung = listOf<PhoneModel>()

    private val google = listOf<PhoneModel>()

    private val huawei = listOf<PhoneModel>()

    private val sony = listOf<PhoneModel>()

    private val vivo = listOf<PhoneModel>()

    private val oneplus = listOf<PhoneModel>()

    private val realme = listOf<PhoneModel>()

    val devices = mutableMapOf(
        "Apple" to apple,
        "Xiaomi" to xiaomi,
        "Samsung" to samsung,
        "Google" to google,
        "Huawei" to huawei,
        "Sony" to sony,
        "Vivo" to vivo,
        "OnePlus" to oneplus,
        "Realme" to realme,
    )
}