package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        System.out.println(ball1 + " (ball1)");

        Ball ball2 = new Ball();
        ball2.setXY(1.5, -2.0);
        System.out.println(ball2 + " (ball2)");

        ball1.move(1.0, 2.0);
        System.out.println(ball1 + " (ball1)");

    }
}

