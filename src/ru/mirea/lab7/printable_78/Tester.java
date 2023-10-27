package ru.mirea.lab7.printable_78;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Printable> array = new ArrayList<>();
        Book book1 = new Book("Горе от ума", "А.С. Грибоедов", 1822);
        Book book2 = new Book("Под куполом", "Стивен Кинг", 2009);

        Magazine magazine1 = new Magazine("Cosmopolitan", "Beauty", 15);
        Magazine magazine2 = new Magazine("PlayBoy", "Boyysss", 23);

        array.add(book1);
        array.add(book2);
        array.add(magazine1);
        array.add(magazine2);

        System.out.println("Журналы:");
        printMagazines(array);
        System.out.println();
        System.out.println("Книги:");
        printBooks(array);

    }

    public static void printMagazines(ArrayList<Printable> printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }

    public static void printBooks(ArrayList<Printable> printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }


}
