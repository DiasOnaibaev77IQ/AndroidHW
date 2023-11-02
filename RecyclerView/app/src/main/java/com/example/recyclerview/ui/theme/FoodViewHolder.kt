package com.example.recyclerview.ui.theme

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

open class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
{
    val foodImage : ImageView = itemView.findViewById(R.id.iv_pizza)
    val foodName : TextView = itemView.findViewById(R.id.tv_pizza_text)
}