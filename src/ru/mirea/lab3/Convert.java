package ru.mirea.lab3;

import java.text.Format;
import java.util.Formatter;
import java.util.Scanner;

public class Convert {
    String currency_name_1, currency_name_2;

    public Convert(String currency_name_1, String currency_name_2){
        this.currency_name_1 = currency_name_1; //присваиваем полю аргумент
        this.currency_name_2 = currency_name_2; //присваиваем полю аргумент
    }
    public Convert(){
        this.currency_name_1 = "None"; //присваиваем полю значение
        this.currency_name_2 = "None"; //присваиваем полю значение
    }

    public void setCurrency_name_2(String currency_name_2) {
        this.currency_name_2 = currency_name_2;
    }
    //метод, меняющий Currency_name_2 на введенный аргумент

    public void setCurrency_name_1(String currency_name_1) {
        this.currency_name_1 = currency_name_1;
    }
    //метод, меняющий Currency_name_2 на введенный аргумент

    public void menuConvert(){
        Scanner read = new Scanner(System.in);
        System.out.println("Hi! It's currency convert: \nYou can choose currency\n \"usd\" - dollar\n \"rub\" - ruble\n " +
                "\"chf\" - franc\n \"eur\" - euro\n \"jpy \" - yen\n \"gbp\" - pound sterling ");
        System.out.println("Please write your currency by 3 little symbol");
        System.out.print("Print first currency name:");
        this.setCurrency_name_2(read.next());
        System.out.print("Print second currency name:");
        this.setCurrency_name_1(read.next());
    }

    public void toConvert(){
        double dollar[] = new double[2];
        switch (this.currency_name_1){
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
        switch (this.currency_name_2){
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
            System.out.printf("%s = %.5f %s", currency_name_1, dollar[1] / dollar[0], currency_name_2);

    }
}
