package com.example.facade

import android.util.Log

class Engine(val sparkPlugs: SparkPlugs, val pistons: Pistons) {

    private val TAG = "Engine"

    fun startEngine() {
        Log.d(TAG, "Starting engine")
        sparkPlugs.startSparkPlugs()
        pistons.startPistons()
    }

    fun stopEngine() {
        Log.d(TAG, "Stopping engine")
        sparkPlugs.stopSparkPlugs()
        pistons.stopPistons()
    }
}