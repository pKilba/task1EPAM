package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//passenger car
public class PassengerCar extends Car {

    private boolean sunroof;
    private String bodyType;

    public PassengerCar() {
        super(123, 44, 55, new Engine(), Arrays.asList(new Wheel()));
    }

    public PassengerCar(int price, int fuelConsumption, int speed, boolean sunroof,
                        Engine engine, List<Wheel> wheel, String bodyType) {
        super(price, fuelConsumption, speed, engine, wheel);
        this.sunroof = sunroof;
        this.bodyType = bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return getSunroof() == that.getSunroof();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSunroof());
    }

    public boolean getSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean doors) {
        this.sunroof = doors;
    }


}

