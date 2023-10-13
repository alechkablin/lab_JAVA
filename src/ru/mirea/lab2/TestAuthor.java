package ru.mirea.lab2;

import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Author author1 = new Author("name", "email@email.com", 'g');
        System.out.println("Enter name");
        String name = sc.nextLine();
        author1.setName(name);
        System.out.println("Enter email");
        String email = sc.nextLine();
        author1.setEmail(email);
        System.out.println("Enter gender");
        String genderInput = sc.next();
        char gender = 'm';
        if (genderInput.length() == 1){
            gender = genderInput.charAt(0);
        }
        author1.setGender(gender);
        System.out.println(author1);
    }
}
