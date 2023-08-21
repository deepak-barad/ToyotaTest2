package com.example.toyotatest.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.toyotatest.databinding.RowProductBinding
import com.example.toyotatest.domain.models.Product
import com.example.toyotatest.presentation.adapters.viewholders.ProductViewHolder

class ProductsRecyclerViewAdapter : RecyclerView.Adapter<ProductViewHolder>() {

    private val products: MutableList<Product> = mutableListOf()

    fun addProduct(product: Product) {
        products.add(product)
        notifyItemInserted(products.size - 1)
    }

    fun clear() {
        products.clear()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val bindingObject =
            RowProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(bindingObject)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(products[position])
    }
}