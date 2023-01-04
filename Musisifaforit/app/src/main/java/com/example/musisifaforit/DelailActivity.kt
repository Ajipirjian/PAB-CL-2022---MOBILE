package com.example.musisifaforit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.musisifaforit.databinding.ActivityDelailBinding

class DelailActivity : AppCompatActivity(R.layout.activity_delail) {
    private val binding : ActivityDelailBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //iconback
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setdata()
    }

    private fun setdata() {
        binding.apply {
            val musisia = intent.getParcelableExtra<Musisi>(EXTRA_DETAIL)

            tvmusician.text = musisia?.Name
            tvalbum.text = musisia?.Album
            tvDetail.text = musisia?.Detail
            tvgenre.text = musisia?.Genre

            Glide.with( this@DelailActivity)
                .load(musisia?.Photo)
                .apply(RequestOptions())
                .into(ivmusicion)

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }
}