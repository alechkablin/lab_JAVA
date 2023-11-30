package ru.mirea.lab23.exercises.ex2;

public interface Queue<T> {
    void enqueue(T element); // добавление элемента в очередь

    T dequeue(); // удаление и возвращение первого элемента из очереди

    T first(); // возвращение первого элемента без его удаления

    int size(); // возвращает количество элементов в очереди

    boolean isEmpty(); // проверяет, пуста ли очередь
}