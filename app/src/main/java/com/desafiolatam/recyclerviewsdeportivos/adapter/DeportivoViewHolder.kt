package com.desafiolatam.recyclerviewsdeportivos.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.desafiolatam.recyclerviewsdeportivos.R
import com.desafiolatam.recyclerviewsdeportivos.databinding.ItemDeportivoBinding
import com.desafiolatam.recyclerviewsdeportivos.model.Deportivo

class DeportivoViewHolder(private val binding: ItemDeportivoBinding) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(deportivo: Deportivo, onClick: (Deportivo) -> Unit){
        with(binding) {
            tvModeloDeportivo.text = deportivo.modelo
            tvFabricanteDeportivo.text = deportivo.fabricante

            Glide.with(ivPaisDeportivo.context)
                .load(deportivo.bandera)
                .centerCrop()
                .error(R.drawable.baseline_error_outline_24)
                .into(ivPaisDeportivo)

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