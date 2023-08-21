package com.example.toyotatest.presentation.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.toyotatest.databinding.ActivityMainBinding
import com.example.toyotatest.presentation.adapters.ProductsRecyclerViewAdapter
import com.example.toyotatest.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var adapter: ProductsRecyclerViewAdapter
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = ProductsRecyclerViewAdapter()
        binding.rvProducts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProducts.adapter = adapter
        setObservers()
        viewModel.getProductsData()
    }

    private fun setObservers() {
        viewModel.productData.observe(this, Observer { root ->
            adapter.clear()
            root.products.forEach { product ->
                adapter.addProduct(product)
            }
        })
    }
}