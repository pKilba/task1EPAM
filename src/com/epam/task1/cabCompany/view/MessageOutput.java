package com.epam.task1.cabCompany.view;

import com.epam.task1.cabCompany.calculation.TransportList;
import com.epam.task1.cabCompany.entity.transport.PassengerCar;

public class MessageOutput {

    public void printTotalPrice(long price) {
        System.out.println("Общая цена " + price);
    }

    public void printFindSpeed(int index) {
        System.out.println("Автомобиль/Автомобили с заданой скоростью : " + TransportList.transportArray.get(index));
    }

    public void printArray() {
        System.out.println("Список автомобилей: ");
        for (PassengerCar o : TransportList.transportArray) {
            System.out.println(o);
        }
    }

    public void printSetSpeed(int minSpeed, int maxSpeed) {
        System.out.println("Заданая скорость от " + minSpeed + " до " + maxSpeed);
    }

    public void printLine() {
        System.out.println("---------------------------------------------------------");
    }

    public void printSortArray() {
        System.out.println("Отсортированый список автомобилей по расходу топлива: ");
        for (PassengerCar o : TransportList.transportArray) {
            System.out.println(o);
        }
    }

    public void printNoFind() {
        System.out.println("Автомобиль с заданой скоростью не найден");
    }


}
