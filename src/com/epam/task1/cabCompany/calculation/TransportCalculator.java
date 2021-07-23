package com.epam.task1.cabCompany.calculation;

import com.epam.task1.cabCompany.data.TransportList;
import com.epam.task1.cabCompany.view.MessagePrinter;

public class TransportCalculator {


    private final MessagePrinter messagePrinter;
    private final TransportList transportList;

    public TransportCalculator(TransportList transportList, MessagePrinter messagePrinter) {
        this.transportList = transportList;
        this.messagePrinter = messagePrinter;
    }


    public void calculate(int minSpeed, int maxSpeed) {
        messagePrinter.printLine();
        sorting();
        messagePrinter.printLine();
        calculateCost();
        messagePrinter.printLine();
        findSpeed(minSpeed, maxSpeed);
        messagePrinter.printLine();
    }


    //сортируем по возрастанию
    private void sorting() {
        messagePrinter.printArray(transportList);
        messagePrinter.printLine();
        transportList.sort();
        messagePrinter.printSortArray(transportList);
    }

    //подсчитываем цену
    private long calculateCost() {
        long totalAmount = 0;
        for (int i = 0; i < transportList.size(); i++) {
            totalAmount += transportList.get(i).getPrice();
        }
        messagePrinter.printTotalPrice(totalAmount);
        return totalAmount;
    }

    //находим авто по скорости
    private TransportList findSpeed(int minSpeed, int maxSpeed) {
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
