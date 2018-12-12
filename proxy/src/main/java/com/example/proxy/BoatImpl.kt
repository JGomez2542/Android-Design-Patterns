package com.example.proxy

import android.util.Log

class BoatImpl : Boat {

    private val TAG = "BoatImpl"

    init {
        Log.d(TAG, "Off loading the boat from the trailer")
    }

    override fun loadBoatToTrailer() {
        Log.d(TAG, "Loading the boat on to the trailer")
    }
}