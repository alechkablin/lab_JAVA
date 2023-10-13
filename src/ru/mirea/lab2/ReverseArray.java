package ru.mirea.lab2;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E"};

        System.out.println("Original array:");
        printArray(array);

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        System.out.println("Array after reversing elements:");
        printArray(array);
    }
    
    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
