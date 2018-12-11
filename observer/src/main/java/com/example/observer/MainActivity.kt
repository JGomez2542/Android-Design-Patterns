package com.example.observer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var myLogger: MyLogger
    lateinit var myToaster: MyToaster
    lateinit var myObservable: MyObservable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLogger = MyLogger()
        myToaster = MyToaster(this)
        myObservable = MyObservable()

        myObservable.addObserver(myLogger)
        myObservable.addObserver(myToaster)
        myObservable.message = "This is my message!"
    }
}
