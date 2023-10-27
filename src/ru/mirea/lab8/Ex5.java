package ru.mirea.lab8;

import java.util.Scanner;

public class Ex5 {
    public static int recursion(int n, int sum) {
        sum = sum + n % 10;
        n = n / 10;
        if (n == 0) {
            return sum;
        } else {
            return recursion(n, sum);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            System.out.println(recursion(n, sum));
        }
    }
}