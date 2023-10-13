package ru.mirea.lab2;

import java.util.Arrays;

public class BookTester {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(3);

        Book book1 = new Book("Author A", "Book 1", 2000);
        Book book2 = new Book("Author B", "Book 2", 1995);
        Book book3 = new Book("Author C", "Book 3", 2010);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println("Latest Book: " + bookshelf.getLatestBook().getTitle());
        System.out.println("Earliest Book: " + bookshelf.getEarliestBook().getTitle());

        System.out.println("Books on the Bookshelf (unsorted):");
        for (int i = 0; i < bookshelf.getBookCount(); i++) {
            Book book = bookshelf.getBooks()[i];
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }

        bookshelf.sortBooksByYear();

        System.out.println("Books on the Bookshelf (sorted by year):");
        for (int i = 0; i < bookshelf.getBookCount(); i++) {
            Book book = bookshelf.getBooks()[i];
            System.out.println(book.getTitle() + " (" + book.getYear() + ")");
        }
    }

    static class Book {
        private String author;
        private String title;
        private int year;

        public Book(String author, String title, int year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    static class Bookshelf {
        private Book[] books;
        private int bookCount;

        public Bookshelf(int capacity) {
            books = new Book[capacity];
            bookCount = 0;
        }

        public void addBook(Book book) {
            if (bookCount < books.length) {
                books[bookCount] = book;
                bookCount++;
            } else {
                System.out.println("The bookshelf is full. Cannot add more books.");
            }
        }

        public int getBookCount() {
            return bookCount;
        }

        public Book[] getBooks() {
            return Arrays.copyOf(books, bookCount);
        }

        public Book getLatestBook() {
            if (bookCount == 0) {
                return null;
            }

            Book latestBook = books[0];
            for (int i = 1; i < bookCount; i++) {
                if (books[i].getYear() > latestBook.getYear()) {
                    latestBook = books[i];
                }
            }
            return latestBook;
        }

        public Book getEarliestBook() {
            if (bookCount == 0) {
                return null;
            }

            Book earliestBook = books[0];
            for (int i = 1; i < bookCount; i++) {
                if (books[i].getYear() < earliestBook.getYear()) {
                    earliestBook = books[i];
                }
            }
            return earliestBook;
        }

        public void sortBooksByYear() {
            Arrays.sort(books, 0, bookCount, (book1, book2) -> book1.getYear() - book2.getYear());
        }
    }
}