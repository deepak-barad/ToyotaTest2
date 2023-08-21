package com.example.toyotatest.data.datasource.remotedatasource

import com.example.toyotatest.domain.IProductDataSource
import com.example.toyotatest.domain.models.Product
import com.example.toyotatest.domain.models.Root
import javax.inject.Inject

class ProductRemoteDataSource @Inject constructor(): IProductDataSource {
    override fun getProductsData(): Root {
        return Root(getProductsFromJson(), 0, 0, 0 )
    }

    private fun getProductsFromJson(): List<Product> {
        return emptyList()
    }
}