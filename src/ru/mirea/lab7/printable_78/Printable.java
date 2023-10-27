package ru.mirea.lab7.printable_78;


public interface Printable {
    void print();
}

class Book implements Printable {
    private final String name;
    private final String author;
    private final Integer year;

    public Book(String name, String author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга %s, автор: %s, год издания: %d\n", name, author, year);
    }
}

class Magazine implements Printable {
    private final String name;
    private final String company;
    private final Integer price;

    public Magazine(String name, String company, Integer price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.printf("Журнал %s, издание: %s, цена: %d$\n", name, company, price);

    }
}

