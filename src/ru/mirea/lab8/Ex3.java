package ru.mirea.lab8;

import java.util.Scanner;

public class Ex3 {
    public static void recursion(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Числа равны");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        recursion(a, b);
    }
}
