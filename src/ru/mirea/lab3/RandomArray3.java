package ru.mirea.lab3;

public class RandomArray3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = (int) (Math.random() * 90) + 10;
        int a = array[0];
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            array[i] = (int) (Math.random() * 90) + 10; //заполняем рандомными числами от 10 до 99;
            System.out.println(array[i]);
            if (array[i] > a) {
                a = array[i];
                cnt += 1;
            } else {
                cnt = 0;
            }
        }
        if (cnt == 3) {
            System.out.println("Строго озрастающая последовательность");
        }
    }
}


