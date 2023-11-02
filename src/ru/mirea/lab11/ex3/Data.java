package ru.mirea.lab11.ex3;

import java.util.Date;

public class Data {
    public static void main(String[] args) {
        Date birthday = new Date();
        Student student = new Student("Sasha", birthday);

        System.out.println(student.getName());
        System.out.println(student.getFormattedBirthday("dd.MM.yyyy"));
        System.out.println(student.getFormattedBirthday("yyyy-MM-dd"));
        System.out.println(student.getFormattedBirthday("MMMM dd, yyyy"));
    }
}