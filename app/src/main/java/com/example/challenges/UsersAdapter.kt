package com.example.challenges

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class UsersAdapter(private val usersList: List<UserModel>): RecyclerView.Adapter<UsersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_users,parent,false)
        return UsersViewHolder(view)

    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {

        holder.userName.text = usersList[position].name
        holder.userType.text = usersList[position].type
    }

    override fun getItemCount(): Int {
       return usersList.size
    }
}