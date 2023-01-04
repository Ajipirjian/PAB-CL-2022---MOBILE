package com.example.myanimelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myanimelist.databinding.ActivityDetailactivityBinding

class Detailactivity : AppCompatActivity(R.layout.activity_detailactivity) {
    private val binding : ActivityDetailactivityBinding by viewBinding()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setdata()
    }

    private fun setdata() {
        binding.apply {
            val anime = intent.getParcelableExtra<animes>(EXTRA_DETAIL)

            tvjudul.text = anime?.judul
            tvgenre.text = anime?.genre
            tvInfo.text = anime?.informasi
            tvdetail.text = anime?.detail

            Glide.with(this@Detailactivity)
                .load(anime?.photo)
                .apply(RequestOptions())
                .into(tvposter)
        }


    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }
}