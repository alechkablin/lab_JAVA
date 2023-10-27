package ru.mirea.lab6.printable6789;


import java.util.ArrayList;

public class Shelf {
    public static void main(String[] args) {
        ArrayList<Printable> list = new ArrayList<>();

        Book book1 = new Book("Горе от ума", "А.С. Грибоедов", 1822);
        Book book2 = new Book("Под куполом", "Стивен Кинг", 2009);

        Magazine magazine1 = new Magazine("Cosmopolitan", "Beauty", 15);
        Magazine magazine2 = new Magazine("PlayBoy", "Boyysss", 23);

        Shop shop = new Shop("World of books", "книги и журналы", "08:00-21:00");

        list.add(shop);
        list.add(book1);
        list.add(book2);
        list.add(magazine1);
        list.add(magazine2);

        for (Printable printable : list) {
            printable.print();
        }

    }
}
