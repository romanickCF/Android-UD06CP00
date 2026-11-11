package com.example.android_ud06cp00

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.android_ud06cp00.databinding.PersonaBinding

class PersonaAdapter(
    private val listaPersonas : List<Persona>,
    private val onClickListener: (Persona) -> Unit,
): Adapter<PersonaViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val binding = PersonaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PersonaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        holder.render(listaPersonas[position], onClickListener)
    }

    override fun getItemCount(): Int = listaPersonas.size


}


