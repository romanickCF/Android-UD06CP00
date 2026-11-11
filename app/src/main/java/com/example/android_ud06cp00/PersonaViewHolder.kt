package com.example.android_ud06cp00

import androidx.recyclerview.widget.RecyclerView
import com.example.android_ud06cp00.databinding.PersonaBinding

class PersonaViewHolder(private val binding: PersonaBinding) :
    RecyclerView.ViewHolder(binding.root){

    fun render(persona: Persona, onClickListener: (Persona) -> Unit){
        binding.tvNombre.text = persona.nombre
        binding.tvDescripcion.text = persona.descripcion
        binding.ivFoto.setImageResource(persona.imagenId)
        binding.root.setOnClickListener { onClickListener(persona)}
    }

}