package com.example.toyotatest.data.repository

import com.example.toyotatest.data.datasource.ProductRemoteDataSource
import com.example.toyotatest.domain.models.ProductCatalogue
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val remoteDataSource: ProductRemoteDataSource
) : ProductRepository {
    override suspend fun getProductsData(): ProductCatalogue {
        return remoteDataSource.getProductsData()
    }
}