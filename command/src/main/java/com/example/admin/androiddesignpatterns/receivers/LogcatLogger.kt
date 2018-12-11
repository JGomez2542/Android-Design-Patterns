package com.example.admin.androiddesignpatterns.receivers

import android.util.Log

/**
 * Receivers perform the actual actions.
 */

class LogcatLogger {

    private val TAG = "LogcatLogger"

    fun LogToLogcat(message: String) {
        Log.d(TAG, message)
    }
}