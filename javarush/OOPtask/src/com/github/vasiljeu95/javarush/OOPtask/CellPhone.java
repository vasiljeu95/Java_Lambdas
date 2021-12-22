package com.github.vasiljeu95.javarush.OOPtask;

public class CellPhone extends WirelessPhone {

    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Call number - " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("The subscriber" + inputNumber + " is calling you");
    }
}
