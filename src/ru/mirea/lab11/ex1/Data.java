package ru.mirea.lab11.ex1;

import java.util.Date;

public class Data {
    public static void main(String[] args) {
        String developerName = "Alina";


        Date startDate = new Date();


        long endDateMillis = System.currentTimeMillis();
        Date endDate = new Date(endDateMillis);


        System.out.println("Разработчик: " + developerName);
        System.out.println("Дата и время получения задания: " + startDate);
        System.out.println("Дата и время сдачи задания: " + endDate);
    }
}
