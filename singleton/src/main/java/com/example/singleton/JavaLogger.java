package com.example.singleton;

import android.util.Log;

public class JavaLogger {

    private static JavaLogger INSTANCE;
    private static String TAG = "JavaLogger";

    private JavaLogger() {

    }

    public static JavaLogger getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new JavaLogger();
        }
        return INSTANCE;
    }

    public void logMessage(String message) {
        Log.d(TAG, message);
    }
}
