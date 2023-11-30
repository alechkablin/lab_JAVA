package ru.mirea.lab23.exercises.ex2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Queue queue = new LinkedQueue<>();

        System.out.println("Добавление элементов в очередь. Введите элементы: ");
        try (Scanner sc = new Scanner(System.in)) {
            String elem = "";
            while (!elem.equals("-")) {
                if (sc.hasNextInt()) {
                    elem = sc.nextLine();
                    Integer elem1 = Integer.parseInt(elem);
                    queue.enqueue(elem1);
                } else {
                    break;
                }
            }
        }
        System.out.println("Вывести первый элемент: " + queue.first());
        System.out.println("Удалить и вернуть первый элемент: " + queue.dequeue());
        System.out.println("Вывести первый элемент: " + queue.first());
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Вывести первый элемент: " + queue.first());
        System.out.println("Удалить и вернуть первый элемент: " + queue.dequeue());
        System.out.println("Вывести первый элемент: " + queue.first());
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Вывести первый элемент: " + queue.first());
        System.out.println("Удалить и вернуть первый элемент: " + queue.dequeue());
        System.out.println("Вывести первый элемент: " + queue.first());
        System.out.println("Размер очереди: " + queue.size());
    }
}