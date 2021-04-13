package com.example.challenges

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AnimeAdapter(list: List<AnimeModel>) :RecyclerView.Adapter<AnimeViewHolder>() {
    val animeList : List<AnimeModel> = list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_users,parent,false)
        return AnimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.userName.text = animeList[position].type
        holder.userType.text = animeList[position].subType
    }

    override fun getItemCount(): Int {
       return animeList.size
    }
}