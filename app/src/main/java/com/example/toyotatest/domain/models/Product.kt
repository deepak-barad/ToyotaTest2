package com.example.toyotatest.domain.models


data class Product (
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var price: Int = 0,
    var discountPercentage: Double = 0.0,
    var rating: Double = 0.0,
    var stock: Int = 0,
    var brand: String? = null,
    var category: String? = null,
    var thumbnail: String? = null,
    var images: ArrayList<String>? = null
)

data class Root (
    var products: List<Product> = emptyList(),
    var total: Int = 0,
    var skip: Int = 0,
    var limit: Int = 0,
)

