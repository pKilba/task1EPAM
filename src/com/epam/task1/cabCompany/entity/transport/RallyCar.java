package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.engine.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;

import java.util.List;

public class RallyCar extends PassengerCar {

    private boolean isRigidSuspensionOn;

    public RallyCar() {
    }

    public RallyCar(int price, int fuelConsumption, int speed, byte doors, Engine engine, List <Wheel> wheel, boolean isRigidSuspensionOn) {
        super(price, fuelConsumption, speed, doors, engine, wheel);
        this.isRigidSuspensionOn = isRigidSuspensionOn;
    }

    public void setRigidSuspensionOn(boolean rigidSuspensionOn) {
        this.isRigidSuspensionOn = rigidSuspensionOn;
    }

    public boolean getsRigidSuspension() {
        return this.isRigidSuspensionOn;
    }
}
