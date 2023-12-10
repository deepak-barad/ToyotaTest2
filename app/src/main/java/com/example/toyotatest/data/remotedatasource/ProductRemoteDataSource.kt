package com.example.toyotatest.data.remotedatasource

import com.example.toyotatest.domain.models.ProductCatalogue

interface ProductRemoteDataSource {
    suspend fun getProductsData(): ProductCatalogue
}