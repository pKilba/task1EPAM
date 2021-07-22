package com.epam.task1.cabCompany.entity.transport;

import com.epam.task1.cabCompany.entity.component.engine.Engine;
import com.epam.task1.cabCompany.entity.component.Wheel;


import java.util.ArrayList;
import java.util.List;


//базовый класс
public abstract class Car implements Comparable<Car> {
    private int price;
    private int fuelConsumption;
    private int speed;
    private Engine engine;
    private final List<Wheel> wheels = new ArrayList<>();


    public Car(int price, int fuelConsumption, int speed, Engine engine, List<Wheel> wheels) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.engine = engine;
        this.wheels.addAll(wheels);
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

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels.addAll(wheels);
    }

    public String toString() {
        return "{" + "\n" + " price = " + getPrice() + "\n" + " speed = " + getSpeed() + "\n" +
                " fuelConsumption = " + getFuelConsumption() + "\n" +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.getFuelConsumption(), car.getFuelConsumption());
    }


}
