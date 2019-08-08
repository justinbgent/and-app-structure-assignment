package com.lambdaschool.android.organization.model

import java.util.*

class ProductData (
    val date: Date = Date(),
    val productName: String = "Toothpaste",
    val productDescription: String = "Will make your teeth shine!",
    val productPrice: Double = 2.36,
    val productTax: Double = productPrice * 0.10,
    val totalProductPrice: Double = productPrice + productTax,
    val productDiscount: Double = .10
)