package com.example.wearosproject

import android.content.Intent
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()

        pika_image1.setOnClickListener {
            startActivityPhoto(R.drawable.pika1)
        }
        pika_image2.setOnClickListener {
            startActivityPhoto(R.drawable.pika2)
        }
        pika_image3.setOnClickListener {
            startActivityPhoto(R.drawable.pika3)
        }
    }

    private fun startActivityPhoto(photoId: Int) {
        val newIntent = Intent(this, PhotoActivity::class.java)
        newIntent.putExtra(PHOTO_KEY, photoId)
        startActivity(newIntent)
    }

    companion object {
        const val PHOTO_KEY = "full_photo"
    }
}
