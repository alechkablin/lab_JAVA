package ru.mirea.lab23.exercises.ex3;

public class Divide extends Expression {
    private final Expression one;
    private final Expression two;

    public Divide(Expression one, Expression two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public double evaluate(double x) {
        return one.evaluate(x) / two.evaluate(x);
    }
}