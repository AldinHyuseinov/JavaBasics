package MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double grade;
        double top = 0.0;
        double between = 0.0;
        double between2 = 0.0;
        double fail = 0.0;
        double average = 0.0;
        for (int i = 1; i <= students; i++) {
            grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5) {
                double topStudents = 0.0;
                topStudents += 1;
                top += 100 * topStudents / students;
            } else if (grade >= 4 && grade <= 4.99) {
                double betweenStudents = 0.0;
                betweenStudents += 1;
                between += 100 * betweenStudents / students;
            } else if (grade >= 3 && grade <= 3.99) {
                double betweenStudents2 = 0.0;
                betweenStudents2 += 1;
                between2 += 100 * betweenStudents2 / students;
            } else {
                double failedStudents = 0.0;
                failedStudents += 1;
                fail += 100 * failedStudents / students;
            }
            average += grade / students;
        }
        System.out.printf("Top students: %.2f%%%n", top);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between2);
        System.out.printf("Fail: %.2f%%%n", fail);
        System.out.printf("Average: %.2f%n", average);
    }
}