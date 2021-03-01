package com.drcarter.concatadaptertest.viewholder

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<VB : ViewDataBinding>(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    protected val binding = DataBindingUtil.bind<VB>(itemView)

}