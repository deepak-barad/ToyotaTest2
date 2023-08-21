package com.example.toyotatest.presentation.adapters.viewholders

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.toyotatest.common.IMAGE_HEIGHT
import com.example.toyotatest.common.IMAGE_WIDTH
import com.example.toyotatest.common.VALUE_ZERO
import com.example.toyotatest.databinding.RowProductBinding
import com.example.toyotatest.domain.models.Product

class ProductViewHolder(private val binding: RowProductBinding) : ViewHolder(binding.root) {
    fun bind(product: Product) {
        binding.tvTitle.text = product.title
        binding.tvDescription.text = product.description
        displayImages(product)
    }

    private fun displayImages(product: Product) {
        var requestOptions = RequestOptions()
        requestOptions = requestOptions.transforms(FitCenter()).override(IMAGE_WIDTH, IMAGE_HEIGHT)
        Glide.with(binding.root.context)
            .load(product.images[VALUE_ZERO])
            .apply(requestOptions)
            .skipMemoryCache(true)
            .into(binding.ivImage)
    }
}