package ru.mirea.lab4;

public class Test {
    public static void main(String[] args) {
        for (Seasons mda : Seasons.values()) {
            mda.message(mda);
        }
        System.out.println("end");
    }
}
