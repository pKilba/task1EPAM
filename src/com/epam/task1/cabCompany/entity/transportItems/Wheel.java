package com.epam.task1.cabCompany.entity.transportItems;

public class Wheel {
    private byte countWheel;

    public Wheel() {
    }

    public Wheel(byte countWheel) {
        this.countWheel = countWheel;
    }

    public byte getCountWheel() {
        return countWheel;
    }

    public void setCountWheel(byte countWheel) {
        this.countWheel = countWheel;
    }
}
