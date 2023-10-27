package ru.mirea.lab6.priceable4;

import java.util.ArrayList;

public class Prices {
    public static void main(String[] args) {
        Computer computer = new Computer("Asus", 999.1);

        Smartphone smartphone = new Smartphone("Honor", 888.8);

        TV tv = new TV("Xiaomi", 777.77);

        ArrayList<Priceable> prices = new ArrayList<>();

        prices.add(computer);
        prices.add(smartphone);
        prices.add(tv);

        for (Priceable priceable : prices) {
            System.out.println(priceable.getPrice());
        }
    }
}
