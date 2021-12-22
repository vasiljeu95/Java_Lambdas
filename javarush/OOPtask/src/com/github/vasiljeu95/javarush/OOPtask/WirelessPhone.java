package com.github.vasiljeu95.javarush.OOPtask;

public abstract class WirelessPhone extends AbstractPhone {
    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}