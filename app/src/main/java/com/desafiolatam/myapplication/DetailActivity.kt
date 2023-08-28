package com.desafiolatam.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.desafiolatam.myapplication.databinding.ActivityDetailBinding
import com.desafiolatam.myapplication.model.Deportivo

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras?.getBundle("BUNDLE")
        val deportivo = bundle?.getParcelable<Deportivo>("DEPORTIVO")

        if (deportivo != null) {
            Log.i("INformacion",deportivo.modelo)
        }

        binding.run {
            deportivo?.run {
                tvModeloDeportivo.text = modelo
                tvFabricanteDeportivo.text = fabricante
                tvPaisDeportivo.text = pais

                Glide.with(applicationContext)
                    .load(photo)
                    .centerCrop()
                    .error(R.drawable.baseline_error_outline_24)
                    .into(ivPhotoDeportivo)
            }
        }

    }
}