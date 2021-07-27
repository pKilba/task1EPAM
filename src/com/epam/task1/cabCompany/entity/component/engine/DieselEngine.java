package com.epam.task1.cabCompany.entity.component.engine;

public class DieselEngine extends Engine {

    private static final float DEFAULT_ELECTRIC_VOLUME = 2.5F;

    public DieselEngine() {
        super(DEFAULT_ELECTRIC_VOLUME);
    }

    public DieselEngine(float engineVolume) {
        super(engineVolume);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
