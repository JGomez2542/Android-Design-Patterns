package com.example.admin.androiddesignpatterns.clients

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.admin.androiddesignpatterns.R
import com.example.admin.androiddesignpatterns.commands.LogToLogcatCommand
import com.example.admin.androiddesignpatterns.commands.LogToLogcatHelloWorldCommand
import com.example.admin.androiddesignpatterns.invokers.LogcatExecutor
import com.example.admin.androiddesignpatterns.receivers.LogcatLogger

/**
 * Clients are tasked with controlling the command execution process.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logcatExecutor = LogcatExecutor()
        logcatExecutor.executeLogToLogcatCommand(LogToLogcatCommand(LogcatLogger()))
        logcatExecutor.executeLogToLogcatCommand(LogToLogcatHelloWorldCommand(LogcatLogger()))
    }
}
