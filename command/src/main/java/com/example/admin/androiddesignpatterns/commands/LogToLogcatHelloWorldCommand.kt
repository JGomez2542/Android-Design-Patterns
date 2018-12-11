package com.example.admin.androiddesignpatterns.commands

import com.example.admin.androiddesignpatterns.receivers.LogcatLogger

class LogToLogcatHelloWorldCommand(var logcatLogger: LogcatLogger) : Command {

    var helloWorld = "Hello World!"

    override fun execute() {
        logcatLogger.LogToLogcat(helloWorld)
    }

}