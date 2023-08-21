package com.example.toyotatest.domain

import com.example.toyotatest.domain.models.Root

interface IProductDataSource {
    fun getProductsData(): Root
}