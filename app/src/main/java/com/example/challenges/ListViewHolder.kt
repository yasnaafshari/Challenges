package com.example.challenges

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var firstText = itemView.findViewById<TextView>(R.id.firstText)!!
    var secondText = itemView.findViewById<TextView>(R.id.secondText)!!

}