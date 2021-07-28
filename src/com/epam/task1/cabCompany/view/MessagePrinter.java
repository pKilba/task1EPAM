package com.epam.task1.cabCompany.view;

import com.epam.task1.cabCompany.entity.model.TransportList;
import com.epam.task1.cabCompany.entity.transport.Car;

public interface MessagePrinter {
    void printTotalPrice(long price);

    void printFindSpeed(Car car);

    void printArray(TransportList transportList);

    void printSetSpeed(int minSpeed, int maxSpeed);

    void printNoFind();

    void printSortArray(TransportList transportList);

    void printInfoAboutClose(boolean isCorrect);

    void printInputAnIntegerNumber(String message);

}
