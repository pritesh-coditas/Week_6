package com.example.week_6.my_dagger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.week_6.HalfSquareArea
import com.example.week_6.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var squareDetails: SquareDetails

    @Inject
    lateinit var squarePerimeter: SquarePerimeter

    @Inject
    lateinit var squareHalfSquareArea: HalfSquareArea

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val side = 5

        // ** manual injection
        /*val perimeterObj = SquarePerimeter()
        val areaObj = SquareArea()
        val detailsObj = SquareDetails(perimeterObj,areaObj)
        detailsObj.findDetails(side)*/

        // ** constructor injection
        //DaggerSquareComponents this implement interface
/*        val component = DaggerSquareComponents.builder().build()

        val detailsObj = component.getSquareDetails()
        detailsObj.findDetails(side)

        binding.mainActivityPerimeterTv.text = detailsObj.perimeter.toString()
        binding.mainActivityAreaTv.text = detailsObj.area.toString()*/

        //** field injection
        //
        val components = DaggerSquareComponents.builder().build()
        components.createObject(this) // fields get initialized ex.- squareDetails, SquarePerimeter

        squareDetails.findDetails(side)

        Log.d("half_area",squareHalfSquareArea.findArea(side).toString())


        binding.mainActivityPerimeterTv.text = squareDetails.perimeter.toString()
        binding.mainActivityAreaTv.text = squareDetails.area.toString()


    }
}


