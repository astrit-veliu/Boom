package com.astritveliu.boom

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import com.astritveliu.boom.utils.animate

class Boom(view: View) {

  private var view: View? = null
  private var hasTouch: Boolean = false

  init {
    this.view = view
    this.view?.let {
      if (!it.hasOnClickListeners()) it.setOnClickListener { }
    }

    attachTouchListener()
  }

  @SuppressLint("ClickableViewAccessibility")
  private fun attachTouchListener() {
    view?.setOnTouchListener { v, motionEvent ->
      when (motionEvent.action) {
        MotionEvent.ACTION_DOWN -> {
          hasTouch = true
          animate(v, 0)
        }
        MotionEvent.ACTION_CANCEL -> {
          v.animate().cancel()
          animate(v, 1)
          hasTouch = false
          true
        }
        MotionEvent.ACTION_MOVE -> {
          v.animate().cancel()
          animate(v, 3)
          hasTouch = false
          false
        }
        MotionEvent.ACTION_UP -> {
          v.animate().cancel()
          if (hasTouch) {
            animate(v, 2)
            hasTouch = true
          }
          animate(v, 3)
          false
        }
      }
      false
    }
  }

  private fun animate(view: View, sequence: Int) {
    var delay = 0
    var duration = 0
    var zoomX = 0f
    var zoomY = 0f

    when (sequence) {
      0 -> {
        zoomX = 0.9f
        zoomY = 0.9f
        duration = 100
        delay = 0
      }
      1 -> {
        zoomX = 1f
        zoomY = 1f
        duration = 100
        delay = 0
      }
      2 -> {
        zoomX = 0.9f
        zoomY = 0.9f
        duration = 100
        delay = 0
      }
      3 -> {
        zoomX = 1f
        zoomY = 1f
        duration = 100
        delay = 101
      }
    }

    view.animate(delay, duration, zoomX, zoomY)
  }
}
