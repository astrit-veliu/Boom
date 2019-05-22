package com.astritveliu.boomdemo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.astritveliu.boom.Boom
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        Boom(cardview)
        Boom(img_launcher)
        Boom(txt_header)
        Boom((material_text_button as? View)!!)

        txt_header.setOnClickListener { Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show() }
    }
}
