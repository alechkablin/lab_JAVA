package ru.mirea.lab8;

public class Ex6 {
    public static boolean recursion(int num, int del) {
        if (del == num) {
            return true;
        }
        if (num % del == 0) {
            return false;
        }
        return recursion(num, del + 1);
    }

    public static void main(String[] args) {
        for (int i = 2; i < 34; i++) {
            if (recursion(i, 2)) {
                System.out.printf("Число %d простое\n", i);
            } else {
                System.out.printf("Число %d сложное\n", i);
            }
        }
    }
}
