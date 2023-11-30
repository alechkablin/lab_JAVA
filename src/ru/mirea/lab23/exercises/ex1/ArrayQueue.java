package ru.mirea.lab23.exercises.ex1;

import java.util.Arrays;

class ArrayQueue {
    private final Object[] queue;
    private int first;
    private int end;
    private int size;
    private final int capacity;

    public ArrayQueue(int initialCapacity) {
        capacity = initialCapacity;
        queue = new Object[capacity];
        first = end = size = 0;
    }

    public void enqueue(Object element) {
        if (size == capacity) {
            throw new IllegalStateException("Очередь переполнена");
        }
        queue[end] = element;
        end = (end + 1) % capacity;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пустая");
        }
        return queue[first];
    }


    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пустая");
        }
        Object element = queue[first];
        queue[first] = null;
        first = (first + 1) % capacity;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(queue, null);
        first = end = size = 0;
    }
}