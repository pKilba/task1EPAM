package com.epam.task1.cabCompany.entity.component;

import java.util.Objects;

public class Engine {

    private final float engineVolume;

    public Engine() {
        engineVolume = 3.5F;
    }

    public Engine(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Float.compare(engine.getEngineVolume(), getEngineVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngineVolume());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineVolume=" + engineVolume +
                '}';
    }
}
