package com.epam.task1.cabCompany.entity.model;

import com.epam.task1.cabCompany.entity.transport.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class TransportList {

    private List<Car> transportList = new ArrayList<>();

    public TransportList() {
    }

    public TransportList(Car... cars) {
        transportList.addAll(Arrays.asList(cars));
    }

    public List<Car> getTransportList() {
        return transportList;
    }

    public void sort() {
        Collections.sort(transportList);
    }

    public int size() {
        return transportList.size();
    }

    public boolean isEmpty() {
        return transportList.isEmpty();
    }

    public boolean contains(Object o) {
        return transportList.contains(o);
    }

    public int indexOf(Object o) {
        return transportList.indexOf(o);
    }

    public Car get(int index) {
        return transportList.get(index);
    }

    public Car set(int index, Car element) {
        return transportList.set(index, element);
    }

    public boolean add(Car Car) {
        return transportList.add(Car);
    }

    public Car remove(int index) {
        return transportList.remove(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportList that = (TransportList) o;
        return Objects.equals(transportList, that.transportList);
    }

    @Override
    public String toString() {
        return "TransportList{" +
                "transportArray=" + transportList +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(transportList);
    }

    public boolean remove(Object o) {
        return transportList.remove(o);
    }

    public boolean addAll(Collection<? extends Car> c) {
        return transportList.addAll(c);
    }

    public void sort(Comparator<? super Car> c) {
        transportList.sort(c);
    }

    public void setTransportList(ArrayList<Car> transportList) {
        this.transportList = transportList;
    }
}
