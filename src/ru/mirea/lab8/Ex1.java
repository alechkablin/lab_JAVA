package ru.mirea.lab8;

import java.util.Scanner;

public class Ex1 {
    public static int recursion(int n, int check) {
        for (int i = 0; i < check; i++) {
            System.out.print(check + " ");
        }
        if (check != n) {
            check += 1;
            return recursion(n, check);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int check = 1;
        recursion(number, check);
    }
}
