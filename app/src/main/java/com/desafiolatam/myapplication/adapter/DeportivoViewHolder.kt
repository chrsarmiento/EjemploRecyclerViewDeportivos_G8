package com.desafiolatam.myapplication.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.desafiolatam.myapplication.R
import com.desafiolatam.myapplication.databinding.ItemDeportivoBinding
import com.desafiolatam.myapplication.model.Deportivo

class DeportivoViewHolder(private val binding: ItemDeportivoBinding) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(deportivo: Deportivo, onClick: (Deportivo) -> Unit){
        with(binding) {
            tvModeloDeportivo.text = deportivo.modelo
            tvFabricanteDeportivo.text = deportivo.fabricante
            tvPaisDeportivo.text = deportivo.pais
            Glide.with(imPhotoDeportivo.context)
                .load(deportivo.photo)
                .centerCrop()
                .error(R.drawable.baseline_error_outline_24)
                .into(imPhotoDeportivo)
        }

        binding.clDeportivo.setOnClickListener {
            onClick?.invoke(deportivo)
        }
    }
}