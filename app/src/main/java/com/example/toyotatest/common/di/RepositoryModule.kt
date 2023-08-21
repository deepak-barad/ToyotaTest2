package com.example.toyotatest.common.di

import com.example.toyotatest.domain.datasource.IProductDataSource
import com.example.toyotatest.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideProductRepository(dataSource: IProductDataSource): ProductRepository =
        ProductRepository(dataSource)
}