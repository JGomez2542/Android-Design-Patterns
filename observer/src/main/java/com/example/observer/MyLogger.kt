package com.example.observer

import android.util.Log

class MyLogger : Observer {

    private val TAG = "MyLogger"

    override fun update(message: String) {
        Log.d(TAG, message)
    }
}