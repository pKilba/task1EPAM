package com.epam.task1.cabCompany.loader;

import com.epam.task1.cabCompany.entity.model.TransportList;
import com.epam.task1.cabCompany.calculator.TransportCalculator;
import com.epam.task1.cabCompany.entity.component.engine.DieselEngine;
import com.epam.task1.cabCompany.entity.component.engine.ElectricMotor;
import com.epam.task1.cabCompany.entity.component.engine.PetrolEngine;
import com.epam.task1.cabCompany.entity.transport.PassengerCar;
import com.epam.task1.cabCompany.entity.component.Wheel;
import com.epam.task1.cabCompany.entity.transport.RallyCar;
import com.epam.task1.cabCompany.entity.transport.SportsСar;
import com.epam.task1.cabCompany.view.MessagePrinter;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        //меняю и вывожу только самые основные поля обьекта
        PassengerCar passengerCar = new PassengerCar(2500, 12, 180, true, new PetrolEngine(), Arrays.asList(new Wheel()));
        RallyCar rallyCar = new RallyCar(9873, 6, 120, false, new ElectricMotor(),
                Arrays.asList(new Wheel()), true);
        SportsСar sportСar = new SportsСar(1987, 11, 280, false, new DieselEngine(),
                Arrays.asList(new Wheel()), true, false);
        TransportList transportList = new TransportList(passengerCar, rallyCar, sportСar);
        MessagePrinter messagePrinter = new MessagePrinter();
        TransportCalculator calculator = new TransportCalculator(transportList, messagePrinter);
        calculator.calculateAndPrintLine(100, 200);

    }
}
