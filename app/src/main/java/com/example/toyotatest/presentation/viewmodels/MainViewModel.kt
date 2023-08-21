package com.example.toyotatest.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.toyotatest.domain.repository.ProductRepository
import com.example.toyotatest.domain.models.ProductCatalogue
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ProductRepository) : ViewModel() {
    private val mProductData: MutableLiveData<ProductCatalogue> = MutableLiveData()
    val productData: LiveData<ProductCatalogue>
        get() = mProductData

    fun getProductsData() {
        viewModelScope.launch(Dispatchers.IO) {
            mProductData.postValue(repository.getProductsData())
        }
    }
}