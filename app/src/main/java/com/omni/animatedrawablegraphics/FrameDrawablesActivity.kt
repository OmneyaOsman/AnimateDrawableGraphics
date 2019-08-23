package com.omni.animatedrawablegraphics

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_frame_drawables.*

class FrameDrawablesActivity : AppCompatActivity() {

    private lateinit var animationDrawable: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_drawables)

    }

    override fun onStart() {
        super.onStart()
        targetImage.setBackgroundResource(R.drawable.wifi_animation_list)
        animationDrawable = targetImage.background as AnimationDrawable
        animationDrawable.start()

    }


    fun startStopAnimation(view: View) {
        if (animationDrawable.isRunning)
            animationDrawable.stop()
        else
            animationDrawable.start()

    }

    override fun onStop() {
        super.onStop()
        animationDrawable.stop()
    }
}
