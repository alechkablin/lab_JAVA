package ru.mirea.lab6.shop;


public class Monitor {
    private final String name;
    private final double size;

    public Monitor(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String toString() {
        return "Model: " + name +
                "\nSize: " + size;
    }
}