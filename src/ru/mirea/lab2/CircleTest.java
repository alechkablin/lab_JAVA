package ru.mirea.lab2;



public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Area: " + circle1.calculateArea());
        System.out.println("Circle 1 - Circumference: " + circle1.calculateCircumference());

        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Area: " + circle2.calculateArea());
        System.out.println("Circle 2 - Circumference: " + circle2.calculateCircumference());

        if (circle1.isEqualTo(circle2)) {
            System.out.println("Circle 1 is equal to Circle 2.");
        } else {
            System.out.println("Circle 1 is not equal to Circle 2.");
        }
    }

    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        public boolean isEqualTo(Circle otherCircle) {
            return this.radius == otherCircle.radius;
        }
    }
}
