package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemSampleViewBinding
import kotlinx.android.synthetic.main.item_sample_view.view.*

class SampleAdapter(var list: MutableList<String>, var callback: Callback) :
    RecyclerView.Adapter<SampleAdapter.RecyclerViewHolder>() {

    interface Callback {

        fun onItemClicked(value: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemSampleViewBinding>(
            inflater,
            R.layout.item_sample_view,
            parent,
            false
        )

        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = list[position]
        val view = holder.itemView

        view.tv_sample.text = item

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class RecyclerViewHolder(val binding: ItemSampleViewBinding) :
        RecyclerView.ViewHolder(binding.root)
}
