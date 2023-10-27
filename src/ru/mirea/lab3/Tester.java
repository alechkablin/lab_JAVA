package ru.mirea.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            double x1 = rand.nextDouble(10) - 5.0;
            double y1 = rand.nextDouble(10) - 5.0;
            double x2 = rand.nextDouble(10) - 5.0;
            double y2 = rand.nextDouble(10) - 5.0;
            Circle buff_circle = new Circle(x1, y1, x2, y2);
            circles.add(buff_circle);
        }
        Collections.sort(circles);
        maxEl(circles);
        min_el(circles);
    }

    public static void maxEl(ArrayList<Circle> circles) {
        System.out.println("Max circle info:\n" + Collections.max(circles));
    }

    public static void min_el(ArrayList<Circle> circles) {
        System.out.println("Min circle info:\n" + Collections.min(circles));
    }

    public static void revers(ArrayList<Circle> circles) {
        Collections.sort(circles);
    }
}
