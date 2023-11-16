package ru.mirea.lab19.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите ИНН: ");
            String inn = scanner.nextLine();

            try {
                if (isValidInn(inn)) {
                    System.out.println("ИНН действителен для клиента " + fullName);
                } else {
                    throw new InvalidInnException("Недействительный ИНН");
                }
            } catch (InvalidInnException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static boolean isValidInn(String inn) {

        if (inn.length() != 10) {
            return false;
        }

        try {
            Long.parseLong(inn);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}

