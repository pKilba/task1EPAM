package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.transportItems.Engine;
import com.epam.task1.cabCompany.entity.transportItems.Wheel;
import com.epam.task1.cabCompany.exception.DataChecking;
import com.epam.task1.cabCompany.exception.NegativeNumbers;

import static java.lang.System.exit;

//базовый класс
public class Car {
    private int price;
    private Integer fuelConsumption;
    private int speed;
    private Engine engine;
    private Wheel wheel;

    public Car() {
    }

    public Car(int price, int fuelConsumption, int speed, Engine engine, Wheel wheel) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.engine = engine;
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        try {
            if (DataChecking.negativeCheck(fuelConsumption))
                throw new NegativeNumbers();
        } catch (NegativeNumbers negativeNumbers) {
            negativeNumbers.printStackTrace();
            exit(1);
        }
        this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(int price) {
        try {
            if (DataChecking.negativeCheck(price))
                throw new NegativeNumbers();
        } catch (NegativeNumbers negativeNumbers) {
            negativeNumbers.printStackTrace();
            exit(1);
        }
        this.price = price;
    }

    public void setSpeed(int speed) {
        try {
            if (DataChecking.negativeCheck(speed))
                throw new NegativeNumbers();
        } catch (NegativeNumbers negativeNumbers) {
            negativeNumbers.printStackTrace();
            exit(1);
        }
        this.speed = speed;
    }

    public void setWheel(Wheel wheel) {

        this.wheel = wheel;
    }

    public String toString() {
        return "{" + "\n" + " price = " + getPrice() + "\n" + " speed = " + getSpeed() + "\n" +
                " fuelConsumption = " + getFuelConsumption() + "\n" +
                '}';
    }

}
