package com.example.di

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

/**
 * Dependency injection allows us to decouple a class from it's dependencies. Eventhough we're missing a dependency injection container, the following is an example
 * of constructor injection.
 */
class MainActivity : AppCompatActivity() {

    lateinit var myLoggerWrapper: MyLoggerWrapper
    lateinit var myLogger: MyLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLogger = MyLogger()
        myLoggerWrapper = MyLoggerWrapper(myLogger)
    }

    fun logSomething(view: View) {
        myLoggerWrapper.logSomething()
    }
}
