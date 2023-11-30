package ru.mirea.lab23.exercises.ex1;

import java.util.Arrays;

class ArrayQueueADT {
    private Object[] queue;
    private int first, end, size, capacity;

    // Инициализация очереди
    public void init(int initialCapacity) {
        capacity = initialCapacity;
        queue = new Object[capacity];
        first = end = size = 0;
    }

    // Добавление элемента в очередь
    public void enqueue(Object element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        queue[end] = element;
        end = (end + 1) % capacity;
        size++;
    }

    // Получение первого элемента в очереди
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[first];
    }

    // Удаление и возврат первого элемента в очереди
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queue[first];
        queue[first] = null;
        first = (first + 1) % capacity;
        size--;
        return element;
    }

    // Получение текущего размера очереди
    public int size() {
        return size;
    }

    // Проверка, является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Очистка очереди
    public void clear() {
        Arrays.fill(queue, null);
        first = end = size = 0;
    }
}