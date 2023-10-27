package ru.mirea.lab3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //сканируем
        int n;
        while (true) {
            System.out.println("Введите положительное число :) -->");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Я просила положительное :/ ");
                System.out.println("Повторите ввод");
            } else {
                System.out.println("Умничка!!!!!");
                break;

            }
        }
        int[] array = new int[n]; //создаем массив
        int[] a = new int[n]; //создаем массив
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);//массив из n случайных чисел
            System.out.println(array[i]);
            if (array[i] % 2 == 0) { //выбираем только четные
                a[cnt] = array[i];
                cnt += 1;
            }
        }
        System.out.println();
        if (cnt > 0) {
            for (int i = 0; i < cnt; i++) {
                System.out.println(a[i]);


            }
        }
    }
}

