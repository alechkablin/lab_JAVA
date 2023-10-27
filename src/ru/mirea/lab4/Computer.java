package ru.mirea.lab4;

public class Computer {
    public static void main(String[] args) {
        for (Name name : Name.values()) {
            System.out.println(name.getMemory() + name.getMonitor());
        }
    }
}

enum Name {
    HP("Intel Core i3", 2, 3),
    ASUS("AMD Ryzen 7", 4, 5),
    HONOR("Intel i7", 7, 8);

    private final String Processor;
    private final int Memory;
    private final int Monitor;

    Name(String processor, int memory, int monitor) {
        Processor = processor;
        Memory = memory;
        Monitor = monitor;
    }

    public int getMemory() {
        return Memory;
    }

    public int getMonitor() {
        return Monitor;
    }

    public String getProcessor() {
        return Processor;
    }
}