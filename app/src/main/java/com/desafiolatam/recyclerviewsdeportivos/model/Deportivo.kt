package com.desafiolatam.recyclerviewsdeportivos.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Deportivo(
    val id: Int,
    val modelo: String,
    val fabricante: String,
    val logoFabricante : String,
    val pais: String,
    val photo: String,
    val bandera: String
) : Parcelable