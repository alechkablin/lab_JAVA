package ru.mirea.lab6;

public class Tester {
    public static void main(String[] args) {
        for (int i = -100; i < 100; i = i + 10) {
            Double d = Double.valueOf(i);
            Convertable.ToCels cels = new Convertable.ToCels(d);
            cels.convert();
        }
    }
}
