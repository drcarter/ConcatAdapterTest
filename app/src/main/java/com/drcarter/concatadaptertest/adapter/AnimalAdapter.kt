package com.drcarter.concatadaptertest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drcarter.concatadaptertest.R
import com.drcarter.concatadaptertest.viewholder.AnimalItemViewHolder

class AnimalAdapter(private val items: MutableList<String> = mutableListOf()) :
    RecyclerView.Adapter<AnimalItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalItemViewHolder =
        AnimalItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.viewholder_animal_item, parent, false)
        )

    override fun onBindViewHolder(holder: AnimalItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun setItems(items: List<String>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun addItem(title: String) {
        this.items.add(title)
        notifyItemInserted(items.size -1)
    }
}