package com.epam.task1.cabCompany.view;

import com.epam.task1.cabCompany.entity.model.TransportList;
import com.epam.task1.cabCompany.entity.transport.Car;

import java.io.IOException;

public class MessagePrinter {


    public void printTotalPrice(long price) {
        System.out.println("Общая цена " + price);
    }

    public void printFindSpeed(Car car) {
        System.out.println("Автомобиль/Автомобили с заданой скоростью : " + car);
    }

    public void printArray(TransportList transportList) {
        System.out.println("Список автомобилей: ");
        for (Car o : transportList.getTransportArray()) {
            System.out.println(o);
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
        for (Car o : transportList.getTransportArray()) {
            System.out.println(o);
        }
    }

    public void printInfoAboutClose(boolean isCorrect) {
        String info = isCorrect ? "Поток закрыт " : "Поток не удалось закрыть ";
        System.out.println(info);
    }

    public void printInputAnIntegerNumber(String message) {
        System.out.println("Пожалуйста введите целое число. " + message);
    }

    public void printNoFind() {
        System.out.println("Автомобиль с заданой скоростью не найден");
    }


}
