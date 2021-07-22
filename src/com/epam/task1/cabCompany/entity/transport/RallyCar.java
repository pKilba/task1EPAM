package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.engine.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;

public class RallyCar extends PassengerCar {

    private boolean rigidSuspension;

    public RallyCar() {
    }

    public RallyCar(int price, int fuelConsumption, int speed, byte doors, Engine engine, Wheel wheel, boolean rigidSuspension) {
        super(price, fuelConsumption, speed, doors, engine, wheel);
        this.rigidSuspension = rigidSuspension;
    }

    public void setRigidSuspension(boolean rigidSuspension) {
        this.rigidSuspension = rigidSuspension;
    }

    public boolean getsRigidSuspension() {
        return this.rigidSuspension;
    }
}
