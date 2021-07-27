package com.epam.task1.cabCompany.calculator;

import com.epam.task1.cabCompany.entity.model.TransportList;
import com.epam.task1.cabCompany.view.MessagePrinter;

public class TransportCalculator {

    private final MessagePrinter messagePrinter;
    private final TransportList transportList;

    public TransportCalculator(TransportList transportList, MessagePrinter messagePrinter) {
        this.transportList = transportList;
        this.messagePrinter = messagePrinter;
    }


    public void calculateAndPrintLine(int minSpeed, int maxSpeed) {
        messagePrinter.printLine();
        sortAndPrintResult();
        messagePrinter.printLine();
        calculateCostAndPrintResult();
        messagePrinter.printLine();
        findBySpeedAndPrintResult(minSpeed, maxSpeed);
        messagePrinter.printLine();
    }

    //sort in ascending order
    private void sortAndPrintResult() {
        messagePrinter.printArray(transportList);
        messagePrinter.printLine();
        transportList.sort();
        messagePrinter.printSortArray(transportList);
    }

    //calculate the price
    private long calculateCostAndPrintResult() {
        long totalAmount = 0;
        for (int i = 0; i < transportList.size(); i++) {
            totalAmount += transportList.get(i).getPrice();
        }
        messagePrinter.printTotalPrice(totalAmount);
        return totalAmount;
    }

    //find a car by speed
    private TransportList findBySpeedAndPrintResult(int minSpeed, int maxSpeed) {
        TransportList transportSetSpeed = new TransportList();
        messagePrinter.printSetSpeed(minSpeed, maxSpeed);
        for (int i = 0; i < transportList.size(); i++) {
            if (minSpeed < transportList.get(i).getSpeed()
                    && transportList.get(i).getSpeed() < maxSpeed) {
                messagePrinter.printFindSpeed(transportList.get(i));
                transportSetSpeed.add(transportList.get(i));
            }
        }

        if (transportSetSpeed.isEmpty()) {
            messagePrinter.printNoFind();
        }
        return transportSetSpeed;
    }


}
