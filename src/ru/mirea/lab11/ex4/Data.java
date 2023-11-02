package ru.mirea.lab11.ex4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Введите год: ");
            int year = sc.nextInt();

            System.out.print("Введите месяц (от 1 до 12): ");
            int month = sc.nextInt() - 1;

            System.out.print("Введите число: ");
            int dayOfMonth = sc.nextInt();

            System.out.print("Введите часы (от 0 до 23): ");
            int hours = sc.nextInt();

            System.out.print("Введите минуты (от 0 до 59): ");
            int minutes = sc.nextInt();

            System.out.print("Введите секунды (от 0 до 59): ");
            int second = sc.nextInt();


            Date date = new Date(year - 1900, month, dayOfMonth, hours, minutes, second);


            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, dayOfMonth, hours, minutes, second);


            System.out.println("Объект Date: " + date);
            System.out.println("Объект Calendar: " + calendar.getTime());


        }
    }
}