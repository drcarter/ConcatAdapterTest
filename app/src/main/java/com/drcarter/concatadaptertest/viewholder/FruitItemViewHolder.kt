package com.drcarter.concatadaptertest.viewholder

import android.view.View
import com.drcarter.concatadaptertest.databinding.ViewholderFruitItemBinding

class FruitItemViewHolder(itemView: View) : BaseViewHolder<ViewholderFruitItemBinding>(itemView) {

    fun bind(title: String) {
        binding?.run {
            textFruitTitle.text = title
        }
    }

}