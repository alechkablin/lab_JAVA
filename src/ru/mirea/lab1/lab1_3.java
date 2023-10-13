package ru.mirea.lab1;
import java.util.Scanner;
public class lab1_3 {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int array[] = new int[size];

        double sum = 0;

        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов массива:");
        System.out.println(sum);
        System.out.println("Среднее арифметическое ряда:");
        System.out.println(sum/size);
    }
}
