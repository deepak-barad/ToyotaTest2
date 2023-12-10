package com.example.toyotatest.data.repository

import com.example.toyotatest.domain.models.ProductCatalogue

interface ProductRepository {
    suspend fun getProductsData(): ProductCatalogue
}