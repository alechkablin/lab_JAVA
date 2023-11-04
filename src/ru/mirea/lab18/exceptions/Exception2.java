package ru.mirea.lab18.exceptions;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)){
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i;
            try {
                i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong type of entered data");
            }
        }
    }
}

