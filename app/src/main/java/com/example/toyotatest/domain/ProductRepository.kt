package com.example.toyotatest.domain

import com.example.toyotatest.domain.models.Root
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val remoteDataSource: IProductDataSource
) :
    IProductDataSource {
    override fun getProductsData(): Root {
        return remoteDataSource.getProductsData()
    }
}