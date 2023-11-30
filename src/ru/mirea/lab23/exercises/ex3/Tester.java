package ru.mirea.lab23.exercises.ex3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        double x;
        try (Scanner sc = new Scanner(System.in)) {
            x = sc.nextDouble();
            Expression expression = new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")),
                    new Multiply(new Const(2), new Variable("x"))), new Const(1)
            );
            double result = expression.evaluate(x);
            System.out.println(result);
        }
    }
}