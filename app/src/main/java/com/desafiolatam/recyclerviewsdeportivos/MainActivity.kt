package com.desafiolatam.recyclerviewsdeportivos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.desafiolatam.recyclerviewsdeportivos.adapter.DeportivoAdapter
import com.desafiolatam.recyclerviewsdeportivos.databinding.ActivityMainBinding
import com.desafiolatam.recyclerviewsdeportivos.model.Deportivo
import com.desafiolatam.recyclerviewsdeportivos.model.DeportivosRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: DeportivoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView(DeportivosRepository.ListadoDeportivos)
    }

    fun initRecyclerView(list: List<Deportivo>){
        adapter = DeportivoAdapter(list) { onItemSelected(it) }
        binding.rcDeportivos.layoutManager = LinearLayoutManager(this)
        binding.rcDeportivos.adapter = adapter
    }

    fun onItemSelected(deportivo: Deportivo){
        startActivity(Intent(applicationContext, DetailActivity::class.java).apply {
            putExtra("BUNDLE", Bundle().apply {
                putParcelable("DEPORTIVO",deportivo)
                putInt("ID",deportivo.id)
            })
        })
    }


}