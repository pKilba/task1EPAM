package com.epam.task1.cabCompany.data;

import com.epam.task1.cabCompany.entity.transport.Car;

import java.util.*;

public class TransportList {

    private List<Car> transportArray = new ArrayList<>();

    public TransportList() {
    }

    public TransportList(Car... cars) {
        transportArray.addAll(Arrays.asList(cars));
    }

    public List<Car> getTransportArray() {
        return transportArray;
    }

    public void sort() {
        Collections.sort(transportArray);
    }

    public int size() {
        return transportArray.size();
    }

    public boolean isEmpty() {
        return transportArray.isEmpty();
    }

    public boolean contains(Object o) {
        return transportArray.contains(o);
    }

    public int indexOf(Object o) {
        return transportArray.indexOf(o);
    }

    public Car get(int index) {
        return transportArray.get(index);
    }

    public Car set(int index, Car element) {
        return transportArray.set(index, element);
    }

    public boolean add(Car Car) {
        return transportArray.add(Car);
    }

    public Car remove(int index) {
        return transportArray.remove(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportList that = (TransportList) o;
        return Objects.equals(transportArray, that.transportArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportArray);
    }

    public boolean remove(Object o) {
        return transportArray.remove(o);
    }

    public boolean addAll(Collection<? extends Car> c) {
        return transportArray.addAll(c);
    }

    public void sort(Comparator<? super Car> c) {
        transportArray.sort(c);
    }

    public void setTransportArray(ArrayList<Car> transportArray) {
        this.transportArray = transportArray;
    }
}
