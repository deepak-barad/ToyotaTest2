package com.example.toyotatest.domain.datasource

import com.example.toyotatest.domain.models.ProductCatalogue

interface IProductDataSource {
    fun getProductsData(): ProductCatalogue
}