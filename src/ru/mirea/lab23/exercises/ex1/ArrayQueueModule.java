package ru.mirea.lab23.exercises.ex1;

import java.util.Arrays;

class ArrayQueueModule {
    private static Object[] queue;
    private static int first, end, size, capacity;

    public static void init(int initialCapacity) {
        capacity = initialCapacity;
        queue = new Object[capacity];
        first = end = size = 0;
    }

    public static void enqueue(Object element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        queue[end] = element;
        end = (end + 1) % capacity;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[first];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queue[first];
        queue[first] = null;
        first = (first + 1) % capacity;
        size--;
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        Arrays.fill(queue, null);
        first = end = size = 0;
    }
}