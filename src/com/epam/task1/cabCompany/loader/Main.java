package com.epam.task1.cabCompany.loader;

import com.epam.task1.cabCompany.data.TransportList;
import com.epam.task1.cabCompany.calculation.TransportCalculator;
import com.epam.task1.cabCompany.entity.component.engine.DieselEngine;
import com.epam.task1.cabCompany.entity.component.engine.ElectricMotor;
import com.epam.task1.cabCompany.entity.component.engine.PetrolEngine;
import com.epam.task1.cabCompany.entity.transport.PassengerCar;
import com.epam.task1.cabCompany.entity.component.Wheel;
import com.epam.task1.cabCompany.view.MessagePrinter;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //меняю и вывожу только самые основные поля обьекта
        PassengerCar firstCar = new PassengerCar(2500, 12, 180, (byte) 4, new PetrolEngine(), Arrays.asList(new Wheel()));
        PassengerCar secondCar = new PassengerCar(9873, 6, 120, (byte) 4, new ElectricMotor(), Arrays.asList(new Wheel()));
        PassengerCar thirdCar = new PassengerCar(1987, 11, 280, (byte) 4, new DieselEngine(), Arrays.asList(new Wheel()));
        TransportList transportList = new TransportList(firstCar, secondCar, thirdCar);
        MessagePrinter messagePrinter = new MessagePrinter();
        // конструктор с параметром диапозона скорости , все методы вызываются при создании обьекта
        TransportCalculator calculator = new TransportCalculator(transportList, messagePrinter);
        calculator.calculate(100, 200);

    }
}
