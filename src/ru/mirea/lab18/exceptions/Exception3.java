package ru.mirea.lab18.exceptions;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)){
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch(NumberFormatException e){
            System.out.println("Wrong type of entered data");
        } catch(Exception e){
            System.out.println("Exception happened");
        }
    }


    public static void main(String[] args) {
        Exception3 e3 = new Exception3();
        e3.exceptionDemo();

    }
}
