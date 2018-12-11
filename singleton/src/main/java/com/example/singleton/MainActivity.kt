package com.example.singleton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var javaLogger: JavaLogger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        javaLogger = JavaLogger.getINSTANCE()

        KotlinLogger.logMessage("kotlin log")
        javaLogger.logMessage("java log")
    }
}
