package com.epam.task1.cabCompany.entity.component.engine;

public class ElectricMotor extends Engine {

    private static final float DEFAULT_ELECTRIC_VOLUME = 3.5F;

    public ElectricMotor() {
        super(DEFAULT_ELECTRIC_VOLUME);
    }

    public ElectricMotor(float engineVolume) {
        super(engineVolume);
    }
}
