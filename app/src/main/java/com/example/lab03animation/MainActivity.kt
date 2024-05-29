package com.example.lab03animation

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var animationImageView: ImageView
    private lateinit var button: Button
    private var currentImageIndex = 0
    private val imageIds = arrayOf(
        R.drawable.r0,
        R.drawable.r1,
        R.drawable.r2,
        R.drawable.r3,
        R.drawable.r4,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animationImageView = findViewById(R.id.animationimageView)
        button = findViewById(R.id.button2)

        button.setOnClickListener {
            currentImageIndex = (currentImageIndex + 1) % imageIds.size
            animationImageView.setImageResource(imageIds[currentImageIndex])
        }
    }
}