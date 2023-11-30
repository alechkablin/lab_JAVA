package ru.mirea.lab23.exercises.ex1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.println("ArrayQueueModule");

        ArrayQueueModule.init(10);

        System.out.println("Добавление элементов в очередь. Введите элементы: ");
        try (Scanner sc = new Scanner(System.in)) {
            String elem = "";
            while (!elem.equals("-")) {
                if (sc.hasNextInt()) {
                    elem = sc.nextLine();
                    Integer elem1 = Integer.parseInt(elem);
                    ArrayQueueModule.enqueue(elem1);
                } else {
                    break;
                }
            }
        }

        System.out.println("Размер очереди: " + ArrayQueueModule.size());

        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удалить и вернуть первый элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Размер очереди: " + ArrayQueueModule.size());

        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удалить и вернуть первый элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Размер очереди: " + ArrayQueueModule.size());

        System.out.println();

        ArrayQueueADT queueADT = new ArrayQueueADT();
        queueADT.init(5);
        queueADT.enqueue(1);
        queueADT.enqueue(2);
        queueADT.enqueue(3);
        queueADT.enqueue(4);
        System.out.println("Первый элемент: " + queueADT.element());
        System.out.println("Удалить и вернуть первый элемент: " + queueADT.dequeue());
        System.out.println("Размер очереди: " + queueADT.size());

        System.out.println("Первый элемент: " + queueADT.element());
        System.out.println("Удалить и вернуть первый элемент: " + queueADT.dequeue());
        System.out.println("Размер очереди: " + queueADT.size());
        queueADT.clear();


        System.out.println();
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удалить и вернуть первый элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удалить и вернуть первый элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());

        queue.clear();

        System.out.println();


    }
}