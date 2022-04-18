package com.tothestars.phoneapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tothestars.phoneapp.databinding.ManufacturerDeviceLayoutBinding

interface ManufacturerAdapterCallback {
    fun onClickItem(item: String)
}

class ManufacturerAdapter(
    private val items: List<String>,
    private val callback: ManufacturerAdapterCallback
) :
    RecyclerView.Adapter<ManufacturerAdapter.ItemHolder>() {

    inner class ItemHolder(val binding: ManufacturerDeviceLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ItemHolder(
            ManufacturerDeviceLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.binding.tvManufacturerLayout.text = item
        holder.binding.tvManufacturerLayout.setOnClickListener {
            callback.onClickItem(item)
        }
    }

    override fun getItemCount() = items.size
}