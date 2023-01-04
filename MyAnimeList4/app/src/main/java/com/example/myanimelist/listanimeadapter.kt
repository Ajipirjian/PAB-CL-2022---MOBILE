package com.example.myanimelist

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myanimelist.databinding.AnimeListItemBinding

class listanimeadapter(private val list : ArrayList<animes>):
    RecyclerView.Adapter <listanimeadapter.ListViewHolder>() {
        inner class  ListViewHolder(private val binding: AnimeListItemBinding ): RecyclerView.ViewHolder(binding.root){
             fun bind(anime : animes){
                 with(binding){
                     tvjudul.text = anime.judul
                     tvgenre.text = anime.genre
                     tvdetail.text = anime.detail
                     Glide.with(itemView.context)
                         .load(anime.photo)
                         .apply(RequestOptions().override(135,192))
                        .into(tvposter)
                     itemView.setOnClickListener {
                         val intent = Intent(itemView.context, Detailactivity::class.java)
                         intent.putExtra(Detailactivity.EXTRA_DETAIL,anime)
                         itemView.context.startActivity(intent)
                     }
                 }
             }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = AnimeListItemBinding.inflate((LayoutInflater.from(parent.context)), parent, false)
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