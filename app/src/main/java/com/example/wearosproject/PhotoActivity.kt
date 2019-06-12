package com.example.wearosproject

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import kotlinx.android.synthetic.main.activity_photo.*

class PhotoActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

        // Enables Always-on
        setAmbientEnabled()

        val photoId = intent.getIntExtra(MainActivity.PHOTO_KEY, R.drawable.notification_bg)
        photo_image.setImageResource(photoId)
    }
}
