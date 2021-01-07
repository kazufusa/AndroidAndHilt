package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private var count: Int = 0
    private var countLiveData = MutableLiveData<Int>(count)

    fun getCount():Int{
        return count
    }

    fun getCountLiveData(): MutableLiveData<Int>{
        return countLiveData
    }

    fun increment() {
        count++
        countLiveData.postValue(count)
    }

    fun decrement() {
        count--
        countLiveData.postValue(count)
    }
}