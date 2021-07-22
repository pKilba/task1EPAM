package com.epam.task1.cabCompany.entity.component;

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

}
