package com.example.toyotatest.domain.models

import com.example.toyotatest.common.EMPTY_STRING
import com.example.toyotatest.common.VALUE_ZERO
import com.example.toyotatest.common.VALUE_ZERO_DOUBLE

data class Product(
    var id: Int = VALUE_ZERO,
    var title: String = EMPTY_STRING,
    var description: String = EMPTY_STRING,
    var price: Int = VALUE_ZERO,
    var discountPercentage: Double = VALUE_ZERO_DOUBLE,
    var rating: Double = VALUE_ZERO_DOUBLE,
    var stock: Int = VALUE_ZERO,
    var brand: String = EMPTY_STRING,
    var category: String = EMPTY_STRING,
    var thumbnail: String = EMPTY_STRING,
    var images: List<String> = emptyList()
)
