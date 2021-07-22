package com.epam.task1.cabCompany.main;

import com.epam.task1.cabCompany.calculation.TransportList;
import com.epam.task1.cabCompany.calculation.TransportCalculator;
import com.epam.task1.cabCompany.entity.transport.PassengerCar;
import com.epam.task1.cabCompany.entity.transportItems.Engine;
import com.epam.task1.cabCompany.entity.transportItems.Wheel;

public class Main {

    public static void main(String[] args) {

        int price = 2500, fuelConsumption = 12, speed = 180;
        byte doors = 4;
        //меняю и вывожу только самые основные поля обьекта
        PassengerCar firstCar = new PassengerCar(price, fuelConsumption, speed, doors, new Engine(), new Wheel());
        PassengerCar secondCar = new PassengerCar(9873, 6, speed, doors, new Engine(), new Wheel());
        //secondCar.setFuelConsumption(-6);
        PassengerCar thirdCar = new PassengerCar(1987, 11, 280, doors, new Engine(), new Wheel());
        TransportList transportList = new TransportList(firstCar, secondCar, thirdCar);
        // конструктор с параметром диапозона скорости , все методы вызываются при создании обьекта
        TransportCalculator compute = new TransportCalculator(100, 200);

    }
}
