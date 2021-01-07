package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val vm: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text)
        vm.getCountLiveData().observe(this, Observer {
            textView.text = it.toString()
            Log.d("MainActivityDebugPrint", vm.getCount().toString())
        })
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            vm.increment()
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            vm.decrement()
        }
    }
}
