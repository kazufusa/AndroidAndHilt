package com.example.myapplication

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private var count: Int = 0

    fun getCounter(): Int {
        return count
    }

    fun increment() {
        count++
    }

    fun decrement() {
        count++
    }
}
