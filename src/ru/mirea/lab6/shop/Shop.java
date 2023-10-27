package ru.mirea.lab6.shop;

import java.util.Collection;

enum Brand {
    HP, HONOR, HUAWEI, DELL, ASUS, LENOVO, ACER
}

public class Shop {
    private final Collection<Computer> computers;

    public Shop(Collection<Computer> computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(Brand brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        return null;
    }
}