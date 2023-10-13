package ru.mirea.lab3;

public class Obolochka1 {

    public static void main(String args[]) {
        String s = ", ";

        int a = 77;
        double b = 7.77;
        float c = 7777;
        String d = "77777";


        Double d1 = Double.valueOf(a);
        Double d2 = Double.valueOf(b);
        Double d3 = Double.valueOf(c);
        Double d4 = Double.parseDouble(d);

        System.out.println("Первое приведение типов:");
        System.out.println("int: " + a + ", double: " + b + ", float: " + c + ", string: " + d);
        System.out.println("Double: " + d1 + s + d2 + s + d3+ s + d4);


        String f = Double.toString(3.14);

        System.out.println("\n" + f);
    }

}