package com.example.toyotatest.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.toyotatest.domain.ProductRepository
import com.example.toyotatest.domain.models.Root
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (private val repository: ProductRepository): ViewModel() {

    private val mProductData: MutableLiveData<Root> = MutableLiveData()

    val productData: LiveData<Root>
        get() =  mProductData

    fun getProductsData() {
        viewModelScope.launch(Dispatchers.IO) {
            mProductData.postValue(repository.getProductsData())
        }
    }
}