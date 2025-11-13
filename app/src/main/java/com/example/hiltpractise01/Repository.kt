package com.example.hiltpractise01

import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class Repository @Inject constructor(
    val calculation: Calculation
){
    fun getText() = "THE DATA FROM THE SERVER IS ${calculation.sum(102,103)}"
}