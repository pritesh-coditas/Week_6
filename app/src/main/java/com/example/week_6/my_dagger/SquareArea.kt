package com.example.week_6

import javax.inject.Inject

interface Area{
    fun findArea(side:Int):Int
}

class SquareArea @Inject constructor():Area{
    @Override
    override fun findArea(side:Int):Int{
        return side*side
    }
}

class HalfSquareArea @Inject constructor():Area{ // loose coupled example
    override fun findArea(side: Int): Int {
        return (side*side)/2
    }
}