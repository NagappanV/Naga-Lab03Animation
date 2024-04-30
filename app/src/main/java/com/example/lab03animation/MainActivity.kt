package com.example.lab03animation

//import android.R
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Get references to ImageVIew elements in the layout
//        val backgroundimageView = findViewById<ImageView>(R.id.backgroundimageView)
        val animationimageView = findViewById<ImageView>(R.id.animationimageView)

//        // Start the background animation
//        val testanimationDrawable = backgroundimageView.background as AnimationDrawable
//        testanimationDrawable.start()

        // Start the animation for the other miages aft a delay
        animationimageView.postDelayed({
            animationimageView.visibility = ImageView.VISIBLE
            animationimageView.setBackgroundResource(R.drawable.animation_list)
            val animationDrawable = animationimageView.background as AnimationDrawable
            animationDrawable.start()
        }, 1000)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

    }
}