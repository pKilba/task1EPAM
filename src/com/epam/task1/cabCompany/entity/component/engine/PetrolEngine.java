package com.epam.task1.cabCompany.entity.component.engine;

public class PetrolEngine extends Engine {
    private static final float DEFAULT_ELECTRIC_VOLUME = 4.5F;

    public PetrolEngine() {
        super(DEFAULT_ELECTRIC_VOLUME);
    }

    public PetrolEngine(float engineVolume) {
        super(engineVolume);
    }
}
