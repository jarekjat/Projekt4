package com.example.projekt4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
const val key1 = "klucz1"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setTheme(R.style.Theme_Projekt4)
        setContentView(R.layout.activity_main)
    }

    fun makeLayout(view: View){
        val b:Button  = view as Button
        val intent:Intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(key1,b.id)
        startActivity(intent)
    }
}