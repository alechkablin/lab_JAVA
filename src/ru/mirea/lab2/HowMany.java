package ru.mirea.lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter sentence:");
            String input = scanner.nextLine();
            String[] words = input.split("[\\s\\t.,;:]+");
            int wordCount = words.length;
            System.out.println("Number of words in the sentence: " + wordCount);
        }
    }
}
