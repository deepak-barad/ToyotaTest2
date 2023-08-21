package com.example.toyotatest.domain.models

import com.example.toyotatest.common.VALUE_ZERO

data class ProductCatalogue (
    var products: List<Product> = emptyList(),
    var total: Int = VALUE_ZERO,
    var skip: Int = VALUE_ZERO,
    var limit: Int = VALUE_ZERO,
)