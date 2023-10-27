package ru.mirea.lab9.ex1;

public class Sort {
    public static void sort(Student[] students) { //сортировка вставками
        for (int i = 1; i < students.length; i++) {
            for (int j = 0; j < i; j++) {
                if (students[i].getNumber() < students[j].getNumber()) {
                    Student temp = students[i];
                    for (int k = i - 1; k >= j; k--) {
                        students[k + 1] = students[k];
                    }
                    students[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Ivan", "Ivanov", 127);
        students[1] = new Student("Oleg", "Olegov", 121);
        students[2] = new Student("Andrew", "Andreev", 124);
        students[3] = new Student("Dasha", "Barinova", 120);

        sort(students);
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
    }
}