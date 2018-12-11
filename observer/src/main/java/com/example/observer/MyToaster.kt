package com.example.observer

import android.content.Context
import android.widget.Toast

/**
 * Keeping a reference to an activity context is considered bad practice. I do it here for educational purposes only.
 */
class MyToaster(val context: Context) : Observer {

    override fun update(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}