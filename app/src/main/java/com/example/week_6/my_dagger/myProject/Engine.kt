package com.example.week_6.my_dagger.myProject

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){
    private val TAG = "car_engine"
    fun engineType(){
        Log.d(TAG,"updated engine")
    }
}