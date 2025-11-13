package com.example.hiltpractise01

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class ScreenViewModel @Inject constructor(
    repository: Repository
):ViewModel(){


    val text = repository.getText()
}