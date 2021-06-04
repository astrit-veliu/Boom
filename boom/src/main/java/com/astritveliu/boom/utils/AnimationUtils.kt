package com.astritveliu.boom.utils

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Build.VERSION_CODES
import android.util.TypedValue
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat

fun View.animate(delay: Int, duration: Int, zoomX: Float, zoomY: Float) {
  val scaleX = ObjectAnimator.ofFloat(this, "scaleX", zoomX)
  val scaleY = ObjectAnimator.ofFloat(this, "scaleY", zoomY)
  val animatorSet = AnimatorSet()
  scaleX.duration = duration.toLong()
  scaleY.duration = duration.toLong()
  animatorSet.playTogether(scaleX, scaleY)
  animatorSet.startDelay = delay.toLong()
  animatorSet.start()
}

@RequiresApi(VERSION_CODES.M) fun View.applyRipple() {
  val result = TypedValue()
  context.theme.resolveAttribute(android.R.attr.selectableItemBackground, result, true)
  this.foreground = ContextCompat.getDrawable(context, result.resourceId)
}