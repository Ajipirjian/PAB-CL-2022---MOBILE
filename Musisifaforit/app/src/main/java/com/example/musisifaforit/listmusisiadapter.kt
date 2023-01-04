package com.example.musisifaforit

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.musisifaforit.databinding.ItemRawMusicianBinding

class listmusisiadapter(private val list: ArrayList<Musisi>) :
    RecyclerView.Adapter<listmusisiadapter.ListViewHolder>() {

    inner class ListViewHolder (private val binding: ItemRawMusicianBinding) : RecyclerView.ViewHolder(binding.root){
       fun bind(musisi: Musisi){
           with(binding){
               tvmusician.text = musisi.Name
               detailmusician.text = musisi.Detail
               Glide.with(itemView.context)
                   .load(musisi.Photo)
                   .apply(RequestOptions().override( 220, 220))
                   .into(ivmusicion)
               itemView.setOnClickListener {
                   val intent = Intent(itemView.context, DelailActivity::class.java)
                   intent.putExtra(DelailActivity.EXTRA_DETAIL, musisi)
                   itemView.context.startActivity(intent)
               }
           }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRawMusicianBinding.inflate((LayoutInflater.from(parent.context)), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}