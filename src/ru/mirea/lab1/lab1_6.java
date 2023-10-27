package ru.mirea.lab1;

import java.util.Scanner;

public class lab1_6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int size = 10;
        double harmonic = 0.0;

        System.out.println("Гармонический ряд:");
        for (int i = 1; i <= size; i++) {
            harmonic += 0.1 / i;

            System.out.printf("1/%d ", i);
        }

    }
}
