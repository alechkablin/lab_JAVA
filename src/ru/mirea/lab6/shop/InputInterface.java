package ru.mirea.lab6.shop;

import java.util.Scanner;

public interface InputInterface {
    Scanner sc = new Scanner(System.in);


    String message = "";

    default int getIntInput(String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    default double getDoubleInput(String message) {
        System.out.println(message);
        return sc.nextDouble();
    }

    default String getStringInput(String message) {
        System.out.println(message);
        return sc.next();
    }
}