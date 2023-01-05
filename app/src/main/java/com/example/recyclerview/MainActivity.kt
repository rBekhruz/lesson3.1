package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView2 = findViewById(R.id.recyclerView2)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        val myAdapter = Adapter()
        recyclerView.adapter = myAdapter
        recyclerView2.adapter = myAdapter

        myAdapter.list = listOf(
            Music("The Lord of the Rings:...", "Альбом - Bear McCreary", R.drawable.pic1),
            Music("The Walking Dead(Ori...", "Альбом - Bear McCreary", R.drawable.pic2),
            Music("Foundation Main Title", "Альбом - Bear McCreary", R.drawable.pic3),
            Music("Under The Influense", "Chris Brown", R.drawable.pic4),
            Music("All I Want For Chrismas Is You", "Mariah Carey", R.drawable.pic5)
        )
        myAdapter.notifyDataSetChanged()

        myAdapter.list = listOf(
            Music("The Lord of the Rings:...", "Альбом - Bear McCreary", R.drawable.pic1),
            Music("The Walking Dead(Ori...", "Альбом - Bear McCreary", R.drawable.pic2),
            Music("Foundation Main Title", "Альбом - Bear McCreary", R.drawable.pic3),
            Music("Under The Influense", "Chris Brown", R.drawable.pic4),
            Music("All I Want For Chrismas Is You", "Mariah Carey", R.drawable.pic5)
        )
        myAdapter.notifyDataSetChanged()
    }
}