package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.transportItems.Engine;
import com.epam.task1.cabCompany.entity.transportItems.Wheel;
import com.epam.task1.cabCompany.exception.DataChecking;
import com.epam.task1.cabCompany.exception.NegativeNumbers;

import static java.lang.System.exit;

//легковой автомобиль
public class PassengerCar extends Car implements Comparable<PassengerCar> {
    private byte doors;

    public PassengerCar() {
    }

    public PassengerCar(int price, int fuelConsumption, int speed, byte doors, Engine engine, Wheel wheel) {

        super(price, fuelConsumption, speed, engine, wheel);
        this.doors = doors;
    }

    public byte getDoors() {
        return doors;
    }

    public void setDoors(byte doors) {
        try {
            if (DataChecking.negativeCheck(doors))
                throw new NegativeNumbers();
        } catch (NegativeNumbers negativeNumbers) {
            negativeNumbers.printStackTrace();
            exit(1);
        }
        this.doors = doors;
    }

    @Override
    public int compareTo(PassengerCar car) {
        int result = this.getFuelConsumption().compareTo(car.getFuelConsumption());
        return result;
    }
}

