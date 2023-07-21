package com.example.menuandroid

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {

    val CustomMenu = CustomMenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val popup = findViewById<ImageView>(R.id.menu_bar)

        popup.setOnClickListener{
            CustomMenu.showMenu(this,it)
        }

    }
}