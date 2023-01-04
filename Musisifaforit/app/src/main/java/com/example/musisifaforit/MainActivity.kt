package com.example.musisifaforit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.musisifaforit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Musisi> = arrayListOf()
    private lateinit var listmusisiadapter: listmusisiadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvmusician.setHasFixedSize(true)
        list.addAll(Musician_data.listData)

        showRecyclerViewlist()

    }

    private fun showRecyclerViewlist() {
        binding.apply {
            rvmusician.layoutManager = LinearLayoutManager( this@MainActivity)
            listmusisiadapter = listmusisiadapter(list)
            rvmusician.adapter = listmusisiadapter
        }
    }
}