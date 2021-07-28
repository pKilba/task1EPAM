package com.epam.task1.cabCompany.view.impl;

import com.epam.task1.cabCompany.entity.model.TransportList;
import com.epam.task1.cabCompany.entity.transport.Car;
import com.epam.task1.cabCompany.view.MessagePrinter;


public class ConsoleMessagePrinter implements MessagePrinter {

    public void printTotalPrice(long price) {
        System.out.println("Общая цена " + price);
    }

    public void printFindSpeed(Car car) {
        System.out.println("Автомобиль/Автомобили с заданой скоростью : " + car);
    }

    public void printArray(TransportList transportList) {
        System.out.println("Список автомобилей: ");
        for (Car car : transportList.getTransportArray()) {
            System.out.println(car);
        }
    }

    public void printSetSpeed(int minSpeed, int maxSpeed) {
        System.out.println("Заданая скорость от " + minSpeed + " до " + maxSpeed);
    }

    public void printLine() {
        System.out.println("---------------------------------------------------------");
    }

    public void printSortArray(TransportList transportList) {
        System.out.println("Отсортированый список автомобилей по расходу топлива: ");
        for (Car car : transportList.getTransportArray()) {
            System.out.println(car);
        }
    }

    public void printInfoAboutClose(boolean isCorrect) {
        String info = isCorrect ?
                "Поток закрыт " :
                "Поток не удалось закрыть ";
        System.out.println(info);
    }

    public void printInputAnIntegerNumber(String message) {
        System.out.println("Пожалуйста введите целое число. " + message);
    }

    public void printNoFind() {
        System.out.println("Автомобиль с заданой скоростью не найден");
    }


}
