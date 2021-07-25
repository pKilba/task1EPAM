package com.epam.task1.cabCompany.entity.component.engine;

public class PetrolEngine extends Engine {
    private static final float DEFAULT_ELECTRIC_VOLUME = 4.5F;

    public PetrolEngine() {
        super(DEFAULT_ELECTRIC_VOLUME);
    }

    public PetrolEngine(float engineVolume) {
        super(engineVolume);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
