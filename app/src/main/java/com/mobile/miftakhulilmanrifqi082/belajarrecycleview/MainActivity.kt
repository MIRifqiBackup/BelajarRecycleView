package com.mobile.miftakhulilmanrifqi082.belajarrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobile.miftakhulilmanrifqi082.belajarrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Rifqi",
        "Alpha",
        "Bravo",
        "Charlie",
        "Delta",
        "Echo",
        "Foxtrot",
        "Golf",
        "Hotel",
        "India",
        "Juliet"
    )

    val listKota = arrayOf(
        "Air Upas",
        "Yogyakarta",
        "Ketapang",
        "Yogyakarta",
        "Ketapang",
        "Yogyakarta",
        "Ketapang",
        "Yogyakarta",
        "Ketapang",
        "Yogyakarta",
        "Ketapang"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mRecyclerView.setHasFixedSize(false)
        binding.mRecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size){

            list.add(Users(listUsers.get(i), listKota.get(i)))
            if (listUsers.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                binding.mRecyclerView.adapter = adapter
            }
        }
    }
}
