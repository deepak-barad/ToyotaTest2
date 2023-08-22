package com.example.toyotatest.common.network

import com.example.toyotatest.domain.models.ProductCatalogue
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.QueryMap

interface IProductCatalogueApi {
    @GET("/products")
    @Headers("Accept: application/json")
    suspend fun getProductCatalogue(@QueryMap options: Map<String, String>): Response<ProductCatalogue>
}