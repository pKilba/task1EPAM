package com.epam.task1.cabCompany.entity.component.engine;

public abstract class Engine {
    private float engineVolume;

    public Engine(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

}
