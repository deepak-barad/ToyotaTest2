package com.example.toyotatest.data.remotedatasource

import com.example.toyotatest.common.MOCK_DATA
import com.example.toyotatest.domain.datasource.IProductDataSource
import com.example.toyotatest.domain.models.ProductCatalogue
import com.google.gson.GsonBuilder
import javax.inject.Inject

class ProductRemoteDataSource @Inject constructor(): IProductDataSource {
    override fun getProductsData(): ProductCatalogue {
        val gson = GsonBuilder().create()
        return gson.fromJson(MOCK_DATA, ProductCatalogue::class.java)
    }
}