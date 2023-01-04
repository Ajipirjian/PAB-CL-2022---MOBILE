package com.example.myanimelist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myanimelist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding : ActivityMainBinding by viewBinding ()
    private val list : ArrayList<animes> = arrayListOf()
    private lateinit var listanimeadapter: listanimeadapter

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about -> {
                Intent(this, aboute_activity::class.java).also {
                    startActivity(it)
                }
            }
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvanime.setHasFixedSize(true)
        list.addAll(data_Anime.listdata)

        showRecycleViewlist()
    }

    private fun showRecycleViewlist() {
        binding.apply {
            rvanime.layoutManager = LinearLayoutManager( this@MainActivity)

            listanimeadapter = listanimeadapter(list)
            rvanime.adapter = listanimeadapter
        }
    }
}