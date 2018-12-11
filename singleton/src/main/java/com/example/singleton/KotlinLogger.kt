package com.example.singleton

import android.util.Log

/**
 * Kotlin object declarations make it easy to create a singleton. Simply use the object keyword when declaring your class.
 */
object KotlinLogger {

    private val TAG = "KotlinLogger"

    fun logMessage(message: String) {
        Log.d(TAG, message)
    }
}