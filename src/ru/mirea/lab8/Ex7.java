package ru.mirea.lab8;

public class Ex7 {
    public static int recursion(int num, int del) {
        if (del == num) {
            return num;
        }
        if (num % del == 0) {
            System.out.print(del + " ");
        }
        return recursion(num, del + 1);
    }

    public static void main(String[] args) {
        int del = 1;
        for (int i = 2; i < 37; i++) {
            System.out.printf("Число %d, делители: ", i);
            System.out.println(recursion(i, del));
        }
    }
}
