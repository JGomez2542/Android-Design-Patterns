package com.example.facade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var mustangGT: CarFacade

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mustangGT = MustangGT()
    }

    fun startCar(view: View) {
        mustangGT.driveCar()
    }

    fun stopCar(view: View) {
        mustangGT.stopCar()
    }
}
