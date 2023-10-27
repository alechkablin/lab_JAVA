package ru.mirea.lab6.shop;

public class Memory {
    private final int capacity;
    private final int speed;

    public Memory(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return "Capacity: " + capacity +
                "\nSpeed: " + speed;
    }
}
