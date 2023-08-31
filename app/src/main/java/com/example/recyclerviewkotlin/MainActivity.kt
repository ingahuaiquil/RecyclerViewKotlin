package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.jpvs.mod5ej15.Pokedex
import com.example.recyclerviewkotlin.databinding.ActivityMainBinding


/* RecyclerView
* crear item layout
*       Definir ID
*       Agregar constraints
*       Cambiar altura de constraints a wrap content*
* crear layout c/RecyclerView
* asignar layout manager
* Adapter + view holder
*
* obtener los datos
*/

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter=Adapter()
        val pokedex=Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.RV.adapter=adapter
    }
}