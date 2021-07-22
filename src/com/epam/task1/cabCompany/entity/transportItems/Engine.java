package com.epam.task1.cabCompany.entity.transportItems;

public class Engine {
    private float engineVolume;

    public Engine() {
    }


    public Engine(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    class PetrolEngine {
    }

    class DieselEngines {
    }

    class ElectricMotors {
    }
}
