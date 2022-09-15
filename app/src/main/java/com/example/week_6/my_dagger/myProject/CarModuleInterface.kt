package com.example.week_6.my_dagger.myProject

import android.app.Application
import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface MyInterface{
    fun carMaxSpeed()
}

class CarDetails @Inject constructor() :MyInterface {
    override fun carMaxSpeed() {
        Log.d("car_details","max speed 800km/hr")
    }
}

class CarModuleInterface @Inject constructor(private val myInterface: MyInterface){
    fun limitFun(){
        myInterface.carMaxSpeed()
    }
}


// how does it works??
@Module
@InstallIn(SingletonComponent::class)
abstract class CarLimits{

    @Binds
    @Singleton
    abstract fun carInfo(carDetails: CarDetails):MyInterface
}

