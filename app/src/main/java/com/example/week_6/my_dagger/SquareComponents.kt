package com.example.week_6.my_dagger

import dagger.Component

@Component
interface SquareComponents {

    fun getSquareDetails(): SquareDetails // fun returns object for SquareDetails

    fun createObject(mainActivity: MainActivity) // function with consumer

}