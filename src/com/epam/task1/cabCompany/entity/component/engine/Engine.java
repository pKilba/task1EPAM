package com.epam.task1.cabCompany.entity.component.engine;

public abstract class Engine {
    private final float engineVolume;

    public Engine(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public float getEngineVolume() {
        return engineVolume;
    }


}
