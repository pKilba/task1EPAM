package com.epam.task1.cabCompany.calculation;

import com.epam.task1.cabCompany.entity.transport.PassengerCar;

import java.util.ArrayList;

public class TransportList {

    public static ArrayList<PassengerCar> transportArray = new ArrayList<>();

    public TransportList() {
    }

    public TransportList(PassengerCar... cars) {
        addToList(cars);
    }

    private void addToList(PassengerCar... cars) {
        for (PassengerCar car : cars) {
            transportArray.add(car);
        }
    }

}
