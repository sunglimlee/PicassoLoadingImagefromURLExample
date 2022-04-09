package com.example.picassoloadingimagefromurlexample

import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.image_view)
        val url = "https://cdn.pixabay.com/photo/2015/11/13/14/44/candle-1042087_960_720.jpg"
        //이거 작동이 안되는데???? 무지하게 쉽기는 하지만
        Picasso.get().load(url).into(imageView)
    }
}