package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private final List<String> computers = new ArrayList<>();//создание динамического массива

    public void addComputer(String computer) {
        computers.add(computer);
        System.out.println("Computer added to the shop.");
    }

    public void deleteComputer(String computer) {
        if (computers.remove(computer)) {
            System.out.println("Computer deleted from the shop.");
        } else {
            System.out.println("Cannot find this computer");
        }
    }

    public void displayComputers() {
        System.out.println("Current list of computers in the shop:");
        for (String computer : computers) {
            System.out.println(computer);
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("Choose action:");
            System.out.println("1. Add computer");
            System.out.println("2. Delete computer");
            System.out.println("3. Display list of computers");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) { //как if
                case 1 -> {
                    System.out.print("Enter your computer: ");
                    String computerDescription = scanner.nextLine();
                    shop.addComputer(computerDescription);
                }
                case 2 -> {
                    System.out.print("Enter computer for deleting: ");
                    String computerToDelete = scanner.nextLine();
                    shop.deleteComputer(computerToDelete);
                }
                case 3 -> shop.displayComputers();
                case 4 -> flag = false;
                default -> System.out.println("Incorrect action.");//для всех остальных
            }
        }

        scanner.close();
    }
}