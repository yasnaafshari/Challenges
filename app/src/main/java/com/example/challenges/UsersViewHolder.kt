package com.example.challenges

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UsersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val userName = itemView.findViewById<TextView>(R.id.userName)!!
    val userType = itemView.findViewById<TextView>(R.id.userType)!!

}