package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Prodcut

object DataService {

    val categories= listOf(
        Category("SHIRTS", "shirt1"),
        Category("HATS", "hat1")
    )

    val shirts = listOf(
        Prodcut("Shirt Dark Blue", "€35", "shirt1"),
        Prodcut("Shirt Orange", "€50", "shirt2")
    )

    val hats = listOf(
        Prodcut("Hat Gray", "€25", "hat1"),
        Prodcut("Hat Orange", "€30", "hat2")
    )
}