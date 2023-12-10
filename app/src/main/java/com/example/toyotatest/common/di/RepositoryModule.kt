package com.example.toyotatest.common.di

import com.example.toyotatest.data.repository.ProductRepository
import com.example.toyotatest.data.repository.ProductRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//@Module
//@InstallIn(SingletonComponent::class)
//object RepositoryModule {
//
//    @Provides
//    fun provideProductRepository(dataSource: ProductRemoteDataSource): ProductRepository =
//        ProductRepositoryImpl(dataSource)
//}

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindProductRepository(productRepositoryImpl: ProductRepositoryImpl): ProductRepository
}