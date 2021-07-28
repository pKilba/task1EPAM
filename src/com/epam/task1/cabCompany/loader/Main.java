package com.epam.task1.cabCompany.loader;

import com.epam.task1.cabCompany.data.impl.ConsoleDataAcquirer;
import com.epam.task1.cabCompany.entity.model.TransportList;
import com.epam.task1.cabCompany.calculator.TransportCalculator;
import com.epam.task1.cabCompany.entity.component.engine.DieselEngine;
import com.epam.task1.cabCompany.entity.component.engine.ElectricMotor;
import com.epam.task1.cabCompany.entity.component.engine.PetrolEngine;
import com.epam.task1.cabCompany.entity.transport.PassengerCar;
import com.epam.task1.cabCompany.entity.component.Wheel;
import com.epam.task1.cabCompany.entity.transport.RallyCar;
import com.epam.task1.cabCompany.entity.transport.SportsСar;
import com.epam.task1.cabCompany.exception.InputStreamConsoleException;
import com.epam.task1.cabCompany.exception.NegativeValueException;
import com.epam.task1.cabCompany.exception.InputDataTypeException;
import com.epam.task1.cabCompany.view.impl.ConsoleMessagePrinter;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NegativeValueException, InputStreamConsoleException, InputDataTypeException {
        ConsoleDataAcquirer consoleDataAcquirer = new ConsoleDataAcquirer();
        PassengerCar passengerCar = new PassengerCar(consoleDataAcquirer.getPrice(), 12,
                180, true, new PetrolEngine(), Arrays.asList(new Wheel()),"Coupe");
        RallyCar rallyCar = new RallyCar(consoleDataAcquirer.getPrice(), 6,
                120, false, new ElectricMotor(), Arrays.asList(new Wheel()), "Hardtop",true);
        SportsСar sportСar = new SportsСar(consoleDataAcquirer.getPrice(), 11,
                280, false, new DieselEngine(), Arrays.asList(new Wheel()),"Universal", true, false);
        TransportList transportList = new TransportList(passengerCar, rallyCar, sportСar);
        ConsoleMessagePrinter consoleMessagePrinter = new ConsoleMessagePrinter();
        TransportCalculator calculator = new TransportCalculator(transportList, consoleMessagePrinter);
        calculator.calculateAndPrintLine(100, 200);
        consoleDataAcquirer.ensureClosingResources();

    }
}
