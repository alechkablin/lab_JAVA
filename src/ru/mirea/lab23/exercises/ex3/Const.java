package ru.mirea.lab23.exercises.ex3;

public class Const extends Expression {
    private final double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(double x) {
        return value;
    }
}