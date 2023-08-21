package com.example.toyotatest.presentation.adapters.viewholders

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.toyotatest.databinding.RowProductBinding
import com.example.toyotatest.domain.models.Product

class ProductViewHolder(private val binding: RowProductBinding) : ViewHolder(binding.root) {

    fun bind(product: Product) {
        binding.tvTitle.text = product.title
        binding.tvDescription.text = product.description
        //bind image
    }
}