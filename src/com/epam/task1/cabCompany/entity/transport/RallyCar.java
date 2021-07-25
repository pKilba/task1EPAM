package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.engine.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;

import java.util.List;
import java.util.Objects;

public class RallyCar extends PassengerCar {

    private boolean isRigidSuspensionOn;

    public RallyCar() {
    }

    public RallyCar(int price, int fuelConsumption, int speed, boolean sunroof, Engine engine, List <Wheel> wheel, boolean isRigidSuspensionOn) {
        super(price, fuelConsumption, speed, sunroof, engine, wheel);
        this.isRigidSuspensionOn = isRigidSuspensionOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RallyCar)) return false;
        if (!super.equals(o)) return false;
        RallyCar rallyCar = (RallyCar) o;
        return isRigidSuspensionOn == rallyCar.isRigidSuspensionOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isRigidSuspensionOn);
    }

    public void setRigidSuspensionOn(boolean rigidSuspensionOn) {
        this.isRigidSuspensionOn = rigidSuspensionOn;
    }

    public boolean getsRigidSuspension() {
        return this.isRigidSuspensionOn;
    }
}
