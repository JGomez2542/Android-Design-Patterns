package com.example.facade

import android.util.Log

class Tires {

    private val TAG = "Tires"

    fun rotateTires() {
        Log.d(TAG, "Rotating tires")
    }

    fun stopTires() {
        Log.d(TAG, "Stopping tires")
    }
}