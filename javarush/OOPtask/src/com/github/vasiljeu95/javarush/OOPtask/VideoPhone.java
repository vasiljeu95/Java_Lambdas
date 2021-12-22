package com.github.vasiljeu95.javarush.OOPtask;

public class VideoPhone extends AbstractPhone {
    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Connecting a video channel for a subscriber " + outputNumber );
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("You have an incoming video call..." + inputNumber);
    }
}
