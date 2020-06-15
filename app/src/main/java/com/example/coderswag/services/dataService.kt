package com.example.coderswag.services

import com.example.coderswag.Models.Product

object dataService {
    val categories = listOf(
        com.example.coderswag.Models.category("HATS", "hatimage"),
        com.example.coderswag.Models.category("SHIRTS", "shirtimage"),
        com.example.coderswag.Models.category("HOODIES", "hoodieimage"),
        com.example.coderswag.Models.category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
        Product("Devslopes Graphic Beanie", "hat1", "$18"),
        Product("Devslopes Black Hat", "hat2", "$20"),
        Product("Devslopes White Hat", "hat3", "$18"),
        Product("Devslopes Snapback Hat", "hat4", "$22")
    )

    val hoodies = listOf(
        Product("Devslopes Dark Gray Hoodie", "hoodie1", "$28"),
        Product("Devslopes Red Hoodie", "hoodie2", "$32"),
        Product("Devslopes Light Gray Hoodie", "hoodie3", "$28"),
        Product("Devslopes Black Hoodie", "hoodie4", "$32")
    )
    val shirts = listOf(
        Product("Devslopes Black Shirt", "shirt1", "$18"),
        Product("Devslopes Extra Light Gray Shirt", "shirt2", "$28"),
        Product("Devslopes Red Shirt", "shirt3", "$22"),
        Product("Devslopes  Light Gray Shirt", "shirt4", "$22"),
        Product("Devslopes Black Shirt", "shirt5", "$18")
    )
}