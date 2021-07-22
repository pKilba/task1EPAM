package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.engine.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;

import java.util.List;

public class SportsСar extends PassengerCar {
    private boolean isAccelerationOn;
    private boolean isSponsorsExists;

    public SportsСar() {
    }

    public SportsСar(int price, int fuelConsumption, int speed, byte doors, Engine engine,
                     List<Wheel> wheel, boolean isAccelerationOn, boolean sponsors) {
        super(price, fuelConsumption, speed, doors, engine, wheel);
        this.isAccelerationOn = isAccelerationOn;
        this.isSponsorsExists = sponsors;
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
