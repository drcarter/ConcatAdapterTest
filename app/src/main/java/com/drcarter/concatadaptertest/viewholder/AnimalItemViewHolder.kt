package com.drcarter.concatadaptertest.viewholder

import android.view.View
import com.drcarter.concatadaptertest.databinding.ViewholderAnimalItemBinding

class AnimalItemViewHolder(itemView: View) : BaseViewHolder<ViewholderAnimalItemBinding>(itemView) {

    fun bind(title: String) {
        binding?.run {
            textAnimalTitle.text = title
        }
    }

}