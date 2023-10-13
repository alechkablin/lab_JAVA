package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculateHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog: " + name + ", Age: " + age + " years";
    }
}

class DogKennel {
    private List<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void displayDogs() {
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    public void displayHumanAges() {
        System.out.println("Dogs' Ages in Human Years:");
        for (Dog dog : dogs) {
            System.out.println(dog.getName() + ": " + dog.calculateHumanAge() + " years");
        }
    }
}

public class Dogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogKennel kennel = new DogKennel();

        System.out.println("Welcome to the Dog Kennel!");
        boolean flagMain = true;
        while (flagMain == true) {
            System.out.print("Enter the dog's name (or 'exit' to quit): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the dog's age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Dog dog = new Dog(name, age);
            kennel.addDog(dog);
            System.out.println("Dog added to the kennel.");

            while (true) {
                System.out.println("\nOptions:");
                System.out.println("1. Display Dogs");
                System.out.println("2. Display Dogs' Ages in Human Years");
                System.out.println("3. Add another dog");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                if (choice == 1) {
                    kennel.displayDogs();
                } else if (choice == 2) {
                    kennel.displayHumanAges();
                } else if (choice == 3) {
                    break; // Exit the inner loop to add another dog
                } else if (choice == 4) {
                    flagMain = false;
                    System.out.println("Exiting...");
                    break;
                }else {
                    System.out.println("Invalid choice.");
                }
            }
        }

        scanner.close();
    }
}