package com.example.challenges

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ListAdapter(private val list: List<UserModel>) : RecyclerView.Adapter<ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.userName.text = list[position].name
        holder.userType.text = list[position].type


    }

    override fun getItemCount(): Int {
        return list.size
    }
}