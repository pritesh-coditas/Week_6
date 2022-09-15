package com.example.week_6.my_dagger.myProject

import android.util.Log
import javax.inject.Inject

class CarColor @Inject constructor() {
    private val TAG = "car_color"
    fun color(){
        Log.d(TAG,"BLACK")
    }
}