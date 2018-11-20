package com.kotlin.viper.common.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.viper.R
import com.kotlin.viper.models.Item
import kotlinx.android.synthetic.main.item_listitem.view.*

class ItemAdapter(val items : ArrayList<Item>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvAnimalType.text = items[position].name
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_listitem, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

}

@Suppress("HasPlatformType")
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvAnimalType = view.tv_item_name
}