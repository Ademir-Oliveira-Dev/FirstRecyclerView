package com.example.listando.data

import com.example.listando.R
import com.example.listando.model.Frases

class DataSource {

    fun loadAffirmations(): List<Frases> {
        return listOf<Frases>(
            Frases(R.string.frase1),
            Frases(R.string.frase2),
            Frases(R.string.frase3),
            Frases(R.string.frase4),
            Frases(R.string.frase5),
            Frases(R.string.frase6),
            Frases(R.string.frase7),
            Frases(R.string.frase8),
            Frases(R.string.frase9),
            Frases(R.string.frase10)
        )
    }
}