package com.example.di

class MyLoggerWrapper(private val logger: MyLogger) {

    fun logSomething() {
        logger.log()
    }
}