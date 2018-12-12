package com.example.proxy

/**
 * We use our BoatProxy to configure our engine and BoatImpl. The BoatProxy helps us hide the configuration details from the client.
 */
class BoatProxy : Boat {

    private var boatImpl: Boat
    private var boatEngine: Engine

    init {
        boatImpl = BoatImpl()
        boatEngine = Engine()
        boatEngine.startBoatEngine()
    }


    override fun loadBoatToTrailer() {
        boatEngine.stopBoatEngine()
        boatImpl.loadBoatToTrailer()
    }
}