package ru.mirea.lab23.exercises.ex2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size; // количество элементов в очереди

    public void enqueue(T element) {
        add(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        size--;
        return remove();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return get();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    protected abstract void add(T element);

    protected abstract T remove();

    protected abstract T get();
}