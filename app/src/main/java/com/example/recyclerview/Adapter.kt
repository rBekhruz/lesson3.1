package com.example.recyclerview;

import android.view.LayoutInflater
import android.view.View;
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
    var list = listOf<Music>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView
        private val textView2: TextView
        private val image: ImageView

        init {
            textView = itemView.findViewById(R.id.name_text)
            textView2 = itemView.findViewById(R.id.author_text)
            image = itemView.findViewById(R.id.image1)
        }

        fun bind(music: Music) {
            textView.text = music.name
            textView2.text = music.author
            image.setImageResource(music.image)
        }
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val inflate = LayoutInflater.from(parent.context)

                val view = inflate.inflate(R.layout.item, parent, false)
                return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.bind(list[position])
        }

        override fun getItemCount(): Int = list.size


}
