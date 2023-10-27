package ru.mirea.lab2;

public class Tester {
    private final Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон. Невозможно добавить больше окружностей.");
        }
    }

    public void displayCircles() {
        System.out.println("Список окружностей:");
        for (int i = 0; i < count; i++) {
            Circle circle = circles[i];
            System.out.println("Окружность " + (i + 1) + ":");
            System.out.println("Центр: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
            System.out.println("Радиус: " + circle.getRadius());
        }
    }

    public static void main(String[] args) {
        Point center1 = new Point(2.0, 3.0);
        Circle circle1 = new Circle(center1, 5.0);

        Point center2 = new Point(-1.0, 0.0);
        Circle circle2 = new Circle(center2, 3.0);

        Tester tester = new Tester(2);
        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.displayCircles();
    }
}
