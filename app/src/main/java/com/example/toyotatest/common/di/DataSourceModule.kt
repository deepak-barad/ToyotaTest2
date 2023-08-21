package com.example.toyotatest.common.di

import com.example.toyotatest.data.remotedatasource.ProductRemoteDataSource
import com.example.toyotatest.domain.datasource.IProductDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindProductDataSource(remoteDataSource: ProductRemoteDataSource): IProductDataSource
}