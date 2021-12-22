package com.github.vasiljeu95.javarush.OOPtask;

public class Phone extends AbstractPhone {
    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Calling the number " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Phone ring!!!");
    }
}
