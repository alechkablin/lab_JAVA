package ru.mirea.lab10;

import java.util.Comparator;

public class SortingStudentsByGPA {
    private static void quickSort(Student[] students, int low, int high, Comparator comparator) {
        if (low < high) {
            int pivotIndex = partition(students, low, high, comparator);
            quickSort(students, low, pivotIndex - 1, comparator);
            quickSort(students, pivotIndex + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator comparator) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) > 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void sort(Student[] students, Comparator comparator) {
        quickSort(students, 0, students.length - 1, comparator);
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("John", "Doe", "Computer Science", 3, "Group A", 3.7);
        students[1] = new Student("Jane", "Smith", "Mathematics", 2, "Group B", 3.9);
        students[2] = new Student("David", "Johnson", "Physics", 4, "Group C", 4.0);
        students[3] = new Student("Sarah", "Williams", "Chemistry", 1, "Group A", 3.5);
        students[4] = new Student("Michael", "Brown", "Biology", 3, "Group B", 3.8);

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        sort(students, Comparator.comparingDouble(Student::getGpa));

        System.out.println("\nAfter sorting by GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}