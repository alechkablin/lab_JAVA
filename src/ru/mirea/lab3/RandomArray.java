package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random rand = new Random(); //создание объекта класса рандом
        int[] array = new int[10]; //создание статического целочисленного массива
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                array[i] = (int) (Math.random() * 11); //заполняем рандомными числами от 0 до 10
            } else {
                array[i] = rand.nextInt(11);
            }
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array); //сортировка
        System.out.println(); //перенос строки
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

