package ru.mirea.lab1;

import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }

        double sum = 0;
        int max = array[0];
        int min = array[0];

        int index = 0;
        do {
            sum += array[index];
            if (array[index] > max) {
                max = array[index];
            }
            if (array[index] < min) {
                min = array[index];
            }
            index++;

        } while (index < size);
        System.out.println("Сумма элементов массива:");
        System.out.println(sum);
        System.out.println("Минимальное число:");
        System.out.println(min);
        System.out.println("Максимальное число:");
        System.out.println(max);
    }
}
