package ru.mirea.lab8;

import java.util.Scanner;

public class Ex2 {
    public static void recursion(int j) {

        for (int i = 1; i <= j; i++) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        recursion(number);
    }

}
