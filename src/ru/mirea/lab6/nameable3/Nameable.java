package ru.mirea.lab6.nameable3;

public interface Nameable {
    String name();
}

class Planet implements Nameable {
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String name() {
        return name;
    }
}

class Car implements Nameable {
    private final String name;
    private final String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public String name() {
        return name + " " + model;
    }
}

class Pet implements Nameable {
    private final String name;
    private final String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public String name() {
        return name + " " + breed;
    }
}

class Person implements Nameable {
    private final String name;
    private final String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public String name() {
        return name + " " + lastName;
    }
}
