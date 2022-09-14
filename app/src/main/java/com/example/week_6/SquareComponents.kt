package com.example.week_6

import dagger.Component

@Component
interface SquareComponents {

    fun getSquareDetails(): SquareDetails // fun returns object for SquareDetails

    fun createObject(mainActivity: MainActivity) // function with consumer

}