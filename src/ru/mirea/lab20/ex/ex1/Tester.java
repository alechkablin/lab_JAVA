package ru.mirea.lab20.ex.ex1;

public class Tester {

    public static void main(String[] args) {
        Generic<Integer, Animal, Integer> test = new Generic<>(10, new Animal("Cat"), 1);

        test.printClass();
    }

}