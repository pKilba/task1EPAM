package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.engine.DieselEngine;
import com.epam.task1.cabCompany.entity.component.engine.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;
import com.epam.task1.cabCompany.data.DataChecking;
import com.epam.task1.cabCompany.exception.NegativeValueException;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;

//легковой автомобиль
public class PassengerCar extends Car {
    private byte doors;


    public PassengerCar() {
        super(123, 44, 55, new DieselEngine(), Arrays.asList(new Wheel()));
    }

    public PassengerCar(int price, int fuelConsumption, int speed, byte doors,
                        Engine engine, List<Wheel> wheel) {
        super(price, fuelConsumption, speed, engine, wheel);
        this.doors = doors;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        this.doors = doors;
    }


}

