package ru.mirea.lab20.ex.ex4;

class Calculator {
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number> double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number> double subtraction(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}