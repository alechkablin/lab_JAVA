package ru.mirea.lab3;

import java.util.Formatter;
import java.util.Scanner;

public class Convert {
    String currencyName1, currencyName2;

    public Convert(String currencyName1, String currencyName2) {
        this.currencyName1 = currencyName1; //присваиваем полю аргумент
        this.currencyName2 = currencyName2; //присваиваем полю аргумент
    }

    public Convert() {
        this.currencyName1 = "None"; //присваиваем полю значение
        this.currencyName2 = "None"; //присваиваем полю значение
    }

    public void setCurrencyName2(String currencyName2) {
        this.currencyName2 = currencyName2;
    }
    //метод, меняющий Currency_name_2 на введенный аргумент

    public void setCurrencyName1(String currencyName1) {
        this.currencyName1 = currencyName1;
    }
    //метод, меняющий Currency_name_2 на введенный аргумент

    public void menuConvert() {
        Scanner read = new Scanner(System.in);
        System.out.println("Hi! It's currency convert: \nYou can choose currency\n \"usd\" - dollar\n \"rub\" - ruble\n " +
                "\"chf\" - franc\n \"eur\" - euro\n \"jpy \" - yen\n \"gbp\" - pound sterling ");
        System.out.println("Please write your currency by 3 little symbol");
        System.out.print("Print first currency name:");
        this.setCurrencyName2(read.next());
        System.out.print("Print second currency name:");
        this.setCurrencyName1(read.next());
    }

    public void toConvert() {
        double[] dollar = new double[2];
        switch (this.currencyName1) {
            case ("usd"):
                dollar[0] = 1.0;
                break;
            case ("chf"):
                dollar[0] = 1.12;
                break;
            case ("rub"):
                dollar[0] = 0.010393;
                break;
            case ("eur"):
                dollar[0] = 1.07;
                break;
            case ("jpy"):
                dollar[0] = 0.006772;
                break;
            case ("gbp"):
                dollar[0] = 1.24;
                break;
            default:
                dollar[1] = 0;
                System.out.println("Error of currency name");
                return;
        }
        switch (this.currencyName2) {
            case ("usd"):
                dollar[1] = 1;
                break;
            case ("chf"):
                dollar[1] = 1.12;
                break;
            case ("rub"):
                dollar[1] = 0.010393;
                break;
            case ("eur"):
                dollar[1] = 1.07;
                break;
            case ("jpy"):
                dollar[1] = 0.006772;
                break;
            case ("gbp"):
                dollar[1] = 1.24;
                break;
            default:
                dollar[1] = 0;
                System.out.println("Error of currency name");
                return;

        }
        Formatter form = new Formatter();
        System.out.printf("%s = %.5f %s", currencyName1, dollar[1] / dollar[0], currencyName2);

    }
}
