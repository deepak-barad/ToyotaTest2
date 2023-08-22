package com.example.toyotatest.domain.repository

import com.example.toyotatest.domain.datasource.IProductDataSource
import com.example.toyotatest.domain.models.ProductCatalogue
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val remoteDataSource: IProductDataSource
) : IProductDataSource {
    override suspend fun getProductsData(): ProductCatalogue {
        return remoteDataSource.getProductsData()
    }
}