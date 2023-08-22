package com.example.toyotatest.data.remotedatasource

import com.example.toyotatest.common.MOCK_DATA
import com.example.toyotatest.common.network.IProductCatalogueApi
import com.example.toyotatest.domain.datasource.IProductDataSource
import com.example.toyotatest.domain.models.ProductCatalogue
import com.google.gson.GsonBuilder
import javax.inject.Inject

class ProductRemoteDataSource @Inject constructor(private val productCatalogueApi: IProductCatalogueApi) :
    IProductDataSource {

    override suspend fun getProductsData(): ProductCatalogue {
        val gson = GsonBuilder().create()
        val queryMap: MutableMap<String, String> = mutableMapOf()
        queryMap["McasTsid"] = "11394"
        queryMap["McasCtx"] = "4"
        val productCatalogue = productCatalogueApi.getProductCatalogue(queryMap)
        println(productCatalogue)
        return gson.fromJson(MOCK_DATA, ProductCatalogue::class.java)
    }
}