package com.example.week_6.my_dagger

import javax.inject.Inject

class SquarePerimeter @Inject constructor() {
    fun findPerimeter(side:Int):Int{
        return side*4
    }
}