package com.github.vasiljeu95.javarush.OOPtask;

public class ThomasEdisonPhone extends AbstractPhone {
    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Rotate the handle!");
        System.out.println("Tell me the subscriber's number, sir");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Phone ring!!!");
    }
}
