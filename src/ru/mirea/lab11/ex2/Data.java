package ru.mirea.lab11.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Date currentDate = new Date();
            System.out.print("Введите дату в формате ДД.ММ.ГГГГ: ");
            String userInput = sc.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date userDate = null;

            try {
                userDate = dateFormat.parse(userInput);
            } catch (java.text.ParseException e) {
                System.out.println("Неверный формат даты!");
                System.exit(1);
            }

            if (userDate.equals(currentDate)) {
                System.out.println("Введенная дата совпадает");
            } else if (userDate.before(currentDate)) {
                System.out.println("Введенная дата меньше");
            } else {
                System.out.println("Введенная дата больше");
            }
        }
    }
}