package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

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
            Music("The Lord of the Rings:...", "Альбом - Bear McCreary", "https://www.game-ost.ru/static/covers_soundtracks/7/0/7083_393862.jpg"),
            Music("The Walking Dead(Ori...", "Альбом - Bear McCreary", "https://avatars.mds.yandex.net/i?id=4e3b83d295aa868dd8e6749240aee86f3c56f833-7755608-images-thumbs&n=13"),
            Music("Foundation Main Title", "Альбом - Bear McCreary", "https://avatars.mds.yandex.net/i?id=73dc77ba1aa937ff0be6c44efa6dcf2e-3301613-images-thumbs&n=13"),
            Music("Under The Influense", "Chris Brown", "https://avatars.mds.yandex.net/i?id=7bd0fdf68ef672ab44de9d2264672f275b043b35-7758455-images-thumbs&n=13"),
            Music("All I Want For Chrismas Is You", "Mariah Carey", "https://avatars.mds.yandex.net/i?id=951f0f139b722bb05e704f564b2a8adfeb72968d-6379389-images-thumbs&n=13")
        )
        myAdapter.notifyDataSetChanged()

        myAdapter.list = listOf(
            Music("The Lord of the Rings:...", "Альбом - Bear McCreary", "https://www.game-ost.ru/static/covers_soundtracks/7/0/7083_393862.jpg"),
            Music("The Walking Dead(Ori...", "Альбом - Bear McCreary", "https://avatars.mds.yandex.net/i?id=4e3b83d295aa868dd8e6749240aee86f3c56f833-7755608-images-thumbs&n=13"),
            Music("Foundation Main Title", "Альбом - Bear McCreary", "https://avatars.mds.yandex.net/i?id=73dc77ba1aa937ff0be6c44efa6dcf2e-3301613-images-thumbs&n=13"),
            Music("Under The Influense", "Chris Brown", "https://avatars.mds.yandex.net/i?id=7bd0fdf68ef672ab44de9d2264672f275b043b35-7758455-images-thumbs&n=13"),
            Music("All I Want For Chrismas Is You", "Mariah Carey", "https://avatars.mds.yandex.net/i?id=951f0f139b722bb05e704f564b2a8adfeb72968d-6379389-images-thumbs&n=13")
        )
        myAdapter.notifyDataSetChanged()

        myAdapter.onClickListener =  {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("image_url", it)
            startActivity(intent)
        }


    }
}