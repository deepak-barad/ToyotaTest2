package com.example.toyotatest.data.datasource

import com.example.toyotatest.domain.models.ProductCatalogue

interface ProductRemoteDataSource {
    suspend fun getProductsData(): ProductCatalogue
}