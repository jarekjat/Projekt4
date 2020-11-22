package com.example.projekt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.get

class SecondActivity : AppCompatActivity() {
    private val TAG:String = "SecondActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout: ViewGroup = getLayout(intent.getIntExtra(key1,-1)) ?: return
        Log.i(TAG,"layout not null")
        layout.addView(ProgressBar(this))
        layout.addView(RadioButton(this))
        layout.addView(RatingBar(this))
        layout.addView(CheckBox(this))
        layout.addView(Switch(this))
        layout.addView(SeekBar(this))
        setContentView(layout)
    }
    private fun getLayout(message: Int): ViewGroup?{
        Log.i(TAG,"message String value: $message")
//        if(message == R.string.linear_layout.toString()){
//            Log.i(TAG,"getLayout: LinearLayout")
//            return LinearLayout(this)
//        }
//        else {
//            Log.i(TAG,"getLayout: GridLayout")
//            return GridLayout(this)
//        }
        return when(message){
            R.id.button_frame_layout->{
                Log.i(TAG,"getLayout: FrameLayout")
                FrameLayout(this)
            }
            R.id.button_linear_layout->{
                Log.i(TAG,"getLayout: LinearLayout")
                LinearLayout(this)
            }
            R.id.button_table_layout-> TableLayout(this)
            R.id.button_grid_layout-> GridLayout(this)
            R.id.button_relative_layout-> RelativeLayout(this)
            else-> {Log.i(TAG,"getLayout: returning null")
                RelativeLayout(this)
            }
        }
    }
}