package com.example.recyclerviewmenu

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList

class Adapter(context: Context, titles: ArrayList<String>, images: ArrayList<Int>):
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    var titles: ArrayList<String>
    var images: ArrayList<Int>
    var inflater: LayoutInflater

    init {
        this.titles = titles
        this.images = images
        this.inflater = LayoutInflater.from(context)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.custom_grid_layout, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title?.text = titles[position]
        holder.image?.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title: TextView? = null
        var image: ImageView? = null

        init {
            title = itemView.findViewById(R.id.textView2)
            image = itemView.findViewById<ImageView>(R.id.imageView2)
            itemView.setOnClickListener { v ->
                Toast.makeText(
                    v.context,
                    "Clicked -> $adapterPosition",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}