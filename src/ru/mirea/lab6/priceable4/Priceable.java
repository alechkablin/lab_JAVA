package ru.mirea.lab6.priceable4;

public interface Priceable {
    String getPrice();
}

class Computer implements Priceable {
    private final Double price;
    private final String model;

    public Computer(String model, Double price) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String getPrice() {
        return model + " " + price + "$";
    }
}

class Smartphone implements Priceable {
    private final Double price;
    private final String model;

    public Smartphone(String model, Double price) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String getPrice() {
        return model + " " + price + "$";
    }
}

class TV implements Priceable {
    private final String model;
    private final Double price;

    public TV(String model, Double price) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String getPrice() {
        return model + " " + price + "$";
    }
}
