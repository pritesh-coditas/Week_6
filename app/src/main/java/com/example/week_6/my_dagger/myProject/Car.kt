package com.example.week_6.my_dagger.myProject

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val carColor:CarColor,private val carEngine: Engine) {
    private val TAG = "car_requirement"

    fun carRequirement(){
        carColor.color()
        carEngine.engineType()
    }
    fun oil(){
        Log.d(TAG,"Petrol")
    }
    fun wheels(){
        Log.d(TAG,"4 wheels")
    }
    fun seat(){
        Log.d(TAG,"4 seat")
    }

}