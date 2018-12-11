package com.example.admin.androiddesignpatterns.commands

import com.example.admin.androiddesignpatterns.receivers.LogcatLogger

class LogToLogcatCommand(var logcatLogger: LogcatLogger) : Command {

    private val logcatMessage = "This is the message"

    override fun execute() {
        logcatLogger.LogToLogcat(logcatMessage)
    }
}