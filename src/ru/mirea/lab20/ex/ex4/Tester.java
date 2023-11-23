package ru.mirea.lab20.ex.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = sc.nextInt();

            Integer[] array = new Integer[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            MinMax<Integer> minMax = new MinMax<>(array);
            Integer min = minMax.findMin();
            Integer max = minMax.findMax();

            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);

            System.out.println("Введите 2 числа:");

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Сумма: " + Calculator.sum(num1, num2));
            System.out.println("Разность: " + Calculator.subtraction(num1, num2));
            System.out.println("Произведение: " + Calculator.multiply(num1, num2));
            System.out.println("Деление: " + Calculator.divide(num1, num2));


        }
    }
}