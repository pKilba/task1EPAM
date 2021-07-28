package com.epam.task1.cabCompany.calculator;

import com.epam.task1.cabCompany.entity.model.TransportList;
import com.epam.task1.cabCompany.view.impl.ConsoleMessagePrinter;

public class TransportCalculator {

    private final ConsoleMessagePrinter consoleMessagePrinter;
    private final TransportList transportList;

    public TransportCalculator(TransportList transportList, ConsoleMessagePrinter consoleMessagePrinter) {
        this.transportList = transportList;
        this.consoleMessagePrinter = consoleMessagePrinter;
    }


    public void calculateAndPrintLine(int minSpeed, int maxSpeed) {
        consoleMessagePrinter.printLine();
        sortAndPrintResult();
        consoleMessagePrinter.printLine();
        calculateCostAndPrintResult();
        consoleMessagePrinter.printLine();
        findBySpeedAndPrintResult(minSpeed, maxSpeed);
        consoleMessagePrinter.printLine();
    }

    //sort in ascending order
    private void sortAndPrintResult() {
        consoleMessagePrinter.printArray(transportList);
        consoleMessagePrinter.printLine();
        transportList.sort();
        consoleMessagePrinter.printSortArray(transportList);
    }

    //calculate the price
    private long calculateCostAndPrintResult() {
        long totalAmount = 0;
        for (int i = 0; i < transportList.size(); i++) {
            totalAmount += transportList.get(i).getPrice();
        }
        consoleMessagePrinter.printTotalPrice(totalAmount);
        return totalAmount;
    }

    //find a car by speed
    private TransportList findBySpeedAndPrintResult(int minSpeed, int maxSpeed) {
        TransportList transportSetSpeed = new TransportList();
        consoleMessagePrinter.printSetSpeed(minSpeed, maxSpeed);
        for (int i = 0; i < transportList.size(); i++) {
            if (minSpeed < transportList.get(i).getSpeed()
                    && transportList.get(i).getSpeed() < maxSpeed) {
                consoleMessagePrinter.printFindSpeed(transportList.get(i));
                transportSetSpeed.add(transportList.get(i));
            }
        }

        if (transportSetSpeed.isEmpty()) {
            consoleMessagePrinter.printNoFind();
        }
        return transportSetSpeed;
    }


}
