package com.example.recoverycompanionapp.ui.screens.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _streak = mutableStateOf(0)
    val streak: State<Int> = _streak

    fun increaseStreak() {
        _streak.value += 1
    }
}
