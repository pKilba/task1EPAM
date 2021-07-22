package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.transport.Acceleration;
import com.epam.task1.cabCompany.entity.transport.PassengerCar;
import com.epam.task1.cabCompany.entity.transportItems.Engine;
import com.epam.task1.cabCompany.entity.transportItems.Wheel;

public class SportsСar extends PassengerCar implements Acceleration {
    private boolean acceleration;
    private boolean sponsors;

    public SportsСar() {
    }

    public SportsСar(int price, int fuelConsumption, int speed, byte doors, Engine engine, Wheel wheel, boolean acceleration, boolean sponsors) {
        super(price, fuelConsumption, speed, doors, engine, wheel);
        this.acceleration = acceleration;
        this.sponsors = sponsors;
    }

    public void setAcceleration(boolean acceleration) {
        this.acceleration = acceleration;
    }

    public void setSponsors(boolean sponsors) {
        this.sponsors = sponsors;
    }

    public boolean getAcceleration() {
        return this.acceleration;
    }

    public boolean getSponsors() {
        return this.sponsors;
    }

    @Override
    public void accelerationOn() {
        acceleration = true;
    }
}
