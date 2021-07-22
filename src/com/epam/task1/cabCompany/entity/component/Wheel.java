package com.epam.task1.cabCompany.entity.component;

public class Wheel {
    private byte tread;

    public Wheel() {
    }

    public Wheel(byte tread) {
        this.tread = tread;
    }

    public byte getTread() {
        return tread;
    }

    public void setTread(byte tread) {
        this.tread = tread;
    }
}
