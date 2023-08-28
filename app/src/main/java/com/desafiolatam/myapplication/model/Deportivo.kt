package com.desafiolatam.myapplication.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Deportivo(
    val id: Int,
    val modelo: String,
    val fabricante: String,
    val pais: String,
    val photo: String
) : Parcelable