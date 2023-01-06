package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var exit: FloatingActionButton

        exit = findViewById(R.id.exit)

        exit.setOnClickListener { onBackPressed() }


        val url = intent.extras?.getString("image_url")
        Glide
            .with(this)
            .load(url)
            .into(findViewById(R.id.imageView))
    }
}