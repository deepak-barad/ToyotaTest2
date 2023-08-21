package com.example.toyotatest.common.di

import com.example.toyotatest.domain.IProductDataSource
import com.example.toyotatest.domain.ProductRepository
import dagger.Binds
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