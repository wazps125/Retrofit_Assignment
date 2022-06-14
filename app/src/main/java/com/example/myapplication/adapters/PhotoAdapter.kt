package com.example.myapplication.adapters

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Photo

class PhotoAdapter(private val mList: List<Photo>) :
    RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemsViewModel = mList[position]
        holder.textView.text = itemsViewModel.title
        holder.textViewUrl.text = itemsViewModel.url
    }

    override fun getItemCount(): Int {
            return mList.size
    }
    class ViewHolder(ItemView:View): RecyclerView.ViewHolder(ItemView) {
        val imageView:ImageView = itemView.findViewById(R.id.imageview)
        val textView:TextView = itemView.findViewById(R.id.textView)
        val textViewUrl = itemView.findViewById<TextView>(R.id.textview_url)

    }
}