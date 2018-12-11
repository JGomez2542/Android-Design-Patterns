package com.example.facade

class MustangGT : CarFacade {

    private val fuelPump = FuelPump()
    private val sparkPlugs = SparkPlugs()
    private val tires = Tires()
    private val pistons = Pistons()
    private val engine = Engine(sparkPlugs, pistons)

    override fun driveCar() {
        engine.startEngine()
        fuelPump.startFuelPump()
        tires.rotateTires()
    }

    override fun stopCar() {
        engine.stopEngine()
        fuelPump.stopFuelPump()
        tires.stopTires()
    }
}