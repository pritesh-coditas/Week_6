package com.example.week_6.my_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week_6.databinding.ActivityCarBinding
import com.example.week_6.my_dagger.myProject.Car
import com.example.week_6.my_dagger.myProject.CarDetails
import com.example.week_6.my_dagger.myProject.CarLimits
import com.example.week_6.my_dagger.myProject.CarModuleInterface
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class CarActivity : AppCompatActivity() {

    @Inject
    lateinit var car : Car

    @Inject
    lateinit var carModuleInterface: CarModuleInterface

    @Inject
    lateinit var carDetails: CarDetails


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityCarBinding = ActivityCarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        car.carRequirement()
        car.oil()
        car.wheels()
        car.seat()

       carModuleInterface.limitFun()
        carDetails.carMaxSpeed()
    }
}