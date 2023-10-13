package ru.mirea.lab2;

public class Ball {
    // Private attributes of coordinates
    private double x;//координаты
    private double y;
    public Ball(double x, double y) {//инициализация
        this.x = x;
        this.y = y;
    }
    public Ball() {
        this(0, 0);
    }//инициализация без аргуметов

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball in (" + x + ", " + y + ")";
    }
}
