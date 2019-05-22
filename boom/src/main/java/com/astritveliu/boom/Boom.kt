package com.astritveliu.boom

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.MotionEvent
import android.view.View
import java.lang.ref.WeakReference

class Boom(view: View) {
    private val view: WeakReference<View>?

    init {
        this.view = WeakReference(view)
        if (this.view.get() != null) {
            if (!this.view.get()?.hasOnClickListeners()!!) {
                this.view.get()?.setOnClickListener{ }
            }
        }
        explode()
    }

    private fun explode() {
        view?.get()?.setOnTouchListener(View.OnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                  //  has_touch = true
                    animate(v,0)
                }
                MotionEvent.ACTION_CANCEL -> {
                    v.animate().cancel()
                    animate(v, 1)
                    true
                }
                MotionEvent.ACTION_UP -> {
                    v.animate().cancel()
                    animate(v, 2)
                    animate(v, 3)
                    false
                }
            }
            false
        })
    }

    private fun animate(view: View, sequence: Int) {

        var delay = 0
        var duration = 0
        var zoom_x = 0f
        var zoom_y = 0f

        when (sequence) {
            0 -> {
                zoom_x = 0.9f
                zoom_y = 0.9f
                duration = 100
                delay = 0
            }
            1 -> {
                zoom_x = 1f
                zoom_y = 1f
                duration = 100
                delay = 0
            }
            2 -> {
                zoom_x = 0.9f
                zoom_y = 0.9f
                duration = 100
                delay = 0
            }
            3 -> {
                zoom_x = 1f
                zoom_y = 1f
                duration = 100
                delay = 101
            }
        }

        val scale_x = ObjectAnimator.ofFloat(view, "scaleX", zoom_x)
        val scale_y = ObjectAnimator.ofFloat(view, "scaleY", zoom_y)
        val animatorSet = AnimatorSet()
        scale_x.duration = duration.toLong()
        scale_y.duration = duration.toLong()
        animatorSet.playTogether(scale_x, scale_y)
        animatorSet.startDelay = delay.toLong()
        animatorSet.start()
    }

}
