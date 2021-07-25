package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.engine.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;

import java.util.List;
import java.util.Objects;

public class SportsСar extends PassengerCar {
    private boolean isAccelerationOn;
    private boolean isSponsorsExists;

    public SportsСar() {
    }

    public SportsСar(int price, int fuelConsumption, int speed, boolean sunroof, Engine engine,
                     List<Wheel> wheel, boolean isAccelerationOn, boolean sponsors) {
        super(price, fuelConsumption, speed, sunroof, engine, wheel);
        this.isAccelerationOn = isAccelerationOn;
        this.isSponsorsExists = sponsors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportsСar)) return false;
        if (!super.equals(o)) return false;
        SportsСar sportsСar = (SportsСar) o;
        return getAccelerationOn() == sportsСar.getAccelerationOn() && isSponsorsExists == sportsСar.isSponsorsExists;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAccelerationOn(), isSponsorsExists);
    }

    public void setAccelerationOn(boolean accelerationOn) {
        this.isAccelerationOn = accelerationOn;
    }

    public void setSponsors(boolean sponsors) {
        this.isSponsorsExists = sponsors;
    }

    public boolean getAccelerationOn() {
        return this.isAccelerationOn;
    }

    public boolean getSponsors() {
        return this.isSponsorsExists;
    }

    public void accelerationOn() {
        isAccelerationOn = true;
    }
}
