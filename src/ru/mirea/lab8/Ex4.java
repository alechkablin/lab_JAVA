package ru.mirea.lab8;

import java.util.Scanner;

public class Ex4 {
    public static int sum(int summ, int num) {
        if (num == 0) {
            return summ;
        } else {
            summ += summ + num % 10;
            return sum(summ, num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int summ = 0;
        int check = 0;
        for (int i = (int) Math.pow(10, k); i < Math.pow(10, k + 1); i++) {
            sum(summ, i);
            if (summ == s) {
                check++;
            }
        }
        System.out.println("check: " + check);
    }
}
