package com.brewery.app.rigain.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.NumberPicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberPicker.minValue = 1
        numberPicker.maxValue = 20
        numberPicker.wrapSelectorWheel = true
        numberPicker.setOnValueChangedListener(object : NumberPicker.OnValueChangeListener{
            override fun onValueChange(p0: NumberPicker?, p1: Int, p2: Int) {
                Log.i(TAG, "Number Selected: old value=$p1 | new value=$p2")
            }

        })

    }
}
