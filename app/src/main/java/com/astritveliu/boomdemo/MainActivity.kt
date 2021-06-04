package com.astritveliu.boomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.astritveliu.boom.Boom
import com.astritveliu.boom.utils.BoomUtils
import com.astritveliu.boom.utils.boom
import com.astritveliu.boom.utils.removeBoom
import com.astritveliu.boomdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    supportActionBar?.hide()

    with(binding) {
      Boom(cardview)
      imgLauncher.boom(true) //ripple effect is optional, by default is set to false
      BoomUtils.boomAll(txtHeader, materialTextButton)

      materialTextButton.setOnClickListener {
        it.removeBoom()
        Toast.makeText(applicationContext, "Removed BOOM", Toast.LENGTH_LONG).show()
      }
    }
  }
}