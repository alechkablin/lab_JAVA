package ru.mirea.lab6.shop10;

interface Shop {
    void print();

}

enum Computer implements Shop {
    HP("Intel Core i3", 2, 3),
    ASUS("AMD Ryzen 7", 4, 5),
    HONOR("Intel i7", 7, 8);

    private final String processor;
    private final int memory;
    private final int monitor;

    Computer(String processor, int memory, int monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public void print() {
        System.out.printf("Модель %s, память: %d, монитор: %d\n", processor, memory, monitor);
    }
}
