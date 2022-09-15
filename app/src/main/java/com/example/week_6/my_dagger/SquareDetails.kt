package com.example.week_6.my_dagger

import com.example.week_6.HalfSquareArea
import javax.inject.Inject

class SquareDetails @Inject constructor(private val perimeterObj: SquarePerimeter, private val areaObj: HalfSquareArea) { // constructor keyword because of annotation
    var area = 0
    var perimeter = 0
    fun findDetails(side:Int){
        perimeter = perimeterObj.findPerimeter(side)
        area = areaObj.findArea(side)
    }
}