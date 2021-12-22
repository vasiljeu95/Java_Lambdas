package com.github.vasiljeu95.testproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num != 0) {
            if (num < 0) {
                System.out.println("this is a negative number");
            } else if (num > 0) {
                System.out.println("this is a positive number");
            }

            if (num < 10) {
                System.out.println("this is a single digit number");
            } else if (num < 100) {
                System.out.println("this is a two-digit number");
            } else if (num < 1000) {
                System.out.println("this is a three-digit number");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
