package com.example.toyotatest.common.di

import com.example.toyotatest.data.datasource.ProductRemoteDataSource
import com.example.toyotatest.data.repository.ProductRepository
import com.example.toyotatest.data.repository.ProductRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideProductRepository(dataSource: ProductRemoteDataSource): ProductRepository =
        ProductRepositoryImpl(dataSource)
}