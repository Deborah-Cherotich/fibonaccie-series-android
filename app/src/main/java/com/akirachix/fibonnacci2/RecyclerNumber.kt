package com.akirachix.fibonnacci2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class RecyclerNumber(var fibonacciSeries: List<Int>):RecyclerView.Adapter<NumberViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val numberView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_list,parent,false)
        return NumberViewHolder(numberView)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
       holder.tvNumbers.text = fibonacciSeries[position].toString()


    }

    override fun getItemCount(): Int {
        return fibonacciSeries.size
    }
}
class NumberViewHolder(numberView:View):RecyclerView.ViewHolder(numberView){
    val tvNumbers = numberView.findViewById<TextView>(R.id.tvNumbers)
}