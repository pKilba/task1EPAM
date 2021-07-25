package com.epam.task1.cabCompany.entity.component;

import java.util.Objects;

public class Wheel {
    private final String tread;

    public Wheel() {
        tread = "Default tread";
    }

    public Wheel(String tread) {
        this.tread = tread;
    }

    public String getTread() {
        return tread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return Objects.equals(getTread(), wheel.getTread());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTread());
    }
}
