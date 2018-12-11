package com.example.observer

class MyObservable {

    var message: String = ""
        set(value) {
            observers.forEach {
                it.update(value)
            }
        }
    val observers: MutableList<Observer> = ArrayList()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }
}