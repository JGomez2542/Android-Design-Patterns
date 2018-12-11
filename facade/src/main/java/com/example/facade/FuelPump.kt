package com.example.facade

import android.util.Log

class FuelPump {

    private val TAG = "FuelPump"

    fun startFuelPump() {
        Log.d(TAG, "Starting fuel pump")
    }

    fun stopFuelPump() {
        Log.d(TAG, "Stopping fuel pump")
    }
}