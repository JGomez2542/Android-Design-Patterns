package com.example.admin.androiddesignpatterns.invokers

import com.example.admin.androiddesignpatterns.commands.Command

/**
 * Invokers know how to execute the given command, but knows nothing about how the command was implemented.
 */

class LogcatExecutor {

    fun executeLogToLogcatCommand(command: Command) {
        command.execute()
    }
}