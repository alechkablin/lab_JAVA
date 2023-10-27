package ru.mirea.lab3;

public class Circle implements Comparable<Circle> {
    public double x2;
    public double y2;
    public Point centerPoint = new Point();
    public double r;


    public Circle(double x1, double y1, double x2, double y2) {
        centerPoint.x = x1;
        centerPoint.y = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }


    public double getR() {
        r = Math.sqrt(Math.pow(x2 - centerPoint.x, 2) + Math.pow(y2 - centerPoint.y, 2));
        return r;
    }


    public String toString() {
        return "Center coordinates: " + "x = " + centerPoint.x + " y = " + centerPoint.y + "\nPoint coordinates: " + "x = " + x2 + " y = " + y2
                + "\nR = " + r;
    }

    public int compareTo(Circle o) {
        return (int) (this.getR() - o.getR());
    }

}