package ru.mirea.lab18.throws_58.ex7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key = myScanner.next();
            printDetails(key);
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isBlank()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemo task7 = new ThrowsDemo();
        task7.getKey();
    }
}
