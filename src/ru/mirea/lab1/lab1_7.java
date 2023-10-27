package ru.mirea.lab1;

import java.util.Scanner;

public class lab1_7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = read.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа n:");
        System.out.println(factorial);

    }
}