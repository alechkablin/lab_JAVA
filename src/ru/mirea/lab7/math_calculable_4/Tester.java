package ru.mirea.lab7.math_calculable_4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = " ";
        Double a, b;
        while (!answer.equals("")) {
            System.out.println("Выберите метод\n1.Возведение в степень\n2.Модуль комплексного числа\n3.Число PI");
            answer = sc.nextLine();
            switch (answer) {
                case "1":
                    System.out.println("Введите a");
                    a = sc.nextDouble();
                    System.out.println("Введите b");
                    b = sc.nextDouble();
                    MathCalculable m1 = new MathFunc();
                    System.out.println(m1.Pow(a, b));
                    sc.nextLine();
                    break;
                case "2":
                    System.out.println("Введите целую часть");
                    a = sc.nextDouble();
                    System.out.println("Введите мнимую часть");
                    b = sc.nextDouble();
                    System.out.printf("Число: %.0f + %.0fi\n", a, b);
                    MathCalculable m2 = new MathFunc();
                    System.out.println(m2.AbsI(a, b));
                    sc.nextLine();
                    break;
                case "3":
                    MathCalculable m3 = new MathFunc();
                    System.out.println(m3.Pi());
                    sc.nextLine();
                    break;
                case "":
                    break;
                default:
                    System.out.println("Такого метода нет");
                    break;
            }
        }
    }
}
