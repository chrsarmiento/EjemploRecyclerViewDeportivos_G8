package com.desafiolatam.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.desafiolatam.myapplication.databinding.ItemDeportivoBinding
import com.desafiolatam.myapplication.model.Deportivo

class DeportivoAdapter(private val deportivoList: List<Deportivo>, private val onClick: (Deportivo) -> Unit) : RecyclerView.Adapter<DeportivoViewHolder>() {

    private lateinit var binding: ItemDeportivoBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeportivoViewHolder {
        binding = ItemDeportivoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DeportivoViewHolder(binding)
    }

    override fun getItemCount(): Int = deportivoList.size

    override fun onBindViewHolder(holder: DeportivoViewHolder, position: Int) {
        val item = deportivoList[position]
        holder.onBind(item, onClick)
    }
}