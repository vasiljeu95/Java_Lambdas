package com.github.vasiljeu95.javarush.OOPtask;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);
        User user = new User("Stark");

        user.callAnotherUser(12345, firstPhone);
        user.callAnotherUser(12345, phone);
        user.callAnotherUser(54321, videoPhone);
    }
}
