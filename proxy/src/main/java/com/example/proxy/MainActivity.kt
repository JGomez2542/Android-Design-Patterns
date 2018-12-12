package com.example.proxy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var boatProxy: Boat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startBoat(view: View) {
        boatProxy = BoatProxy()
    }

    fun stopBoat(view: View) {
        boatProxy.loadBoatToTrailer()
    }
}
