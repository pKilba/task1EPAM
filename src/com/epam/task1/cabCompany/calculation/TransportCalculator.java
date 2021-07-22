package com.epam.task1.cabCompany.calculation;

import com.epam.task1.cabCompany.view.MessageOutput;
import com.epam.task1.cabCompany.entity.transport.PassengerCar;

import java.util.ArrayList;
import java.util.Collections;

public class TransportCalculator {

    private long totalAmount;
    private ArrayList<PassengerCar> transportSetSpeed = new ArrayList();
    private MessageOutput messageOutput = new MessageOutput();

    public TransportCalculator() {
        sorting();
        calculateСost();
    }

    public TransportCalculator(int minSpeed, int maxSpeed) {
        messageOutput.printLine();
        sorting();
        messageOutput.printLine();
        calculateСost();
        messageOutput.printLine();
        findSpeed(minSpeed, maxSpeed);
        messageOutput.printLine();
    }

    //сортируем по возрастанию
    private void sorting() {
        messageOutput.printArray();
        messageOutput.printLine();
        Collections.sort(TransportList.transportArray);
        messageOutput.printSortArray();
    }

    //подсчитываем цену
    private long calculateСost() {
        for (int i = 0; i < TransportList.transportArray.size(); i++)
            totalAmount += TransportList.transportArray.get(i).getPrice();
        messageOutput.printTotalPrice(totalAmount);
        return totalAmount;
    }

    //находим авто по скорости
    private ArrayList<PassengerCar> findSpeed(int minSpeed, int maxSpeed) {
        messageOutput.printSetSpeed(minSpeed, maxSpeed);
        for (int i = 0; i < TransportList.transportArray.size(); i++)
            if (minSpeed < TransportList.transportArray.get(i).getSpeed()
                    && TransportList.transportArray.get(i).getSpeed() < maxSpeed) {
                messageOutput.printFindSpeed(i);
                transportSetSpeed.add(TransportList.transportArray.get(i));
            }

        if (transportSetSpeed.isEmpty()) {
            messageOutput.printNoFind();
            return null;
        }
        return transportSetSpeed;
    }

    //setTotalAmount не будет
    public long getTotalAmount() {
        return totalAmount;
    }
}
