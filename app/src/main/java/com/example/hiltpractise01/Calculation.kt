package com.example.hiltpractise01


import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Calculation @Inject constructor(){
    fun sum(num01: Int, num02:Int){
        num01 + num02
    }
}