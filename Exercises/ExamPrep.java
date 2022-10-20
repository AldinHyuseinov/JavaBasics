package Exercises;

import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedGrades = Integer.parseInt(scanner.nextLine());
        String subject = scanner.nextLine();
        int counter = 0;
        int failedCount = 0;
        double totalGrades = 0;
        boolean isFailed = true;
        String last = "";
        while (!subject.equals("Enough")) {
            counter++;
            int grades = Integer.parseInt(scanner.nextLine());
            totalGrades += grades;
            if (grades <= 4) {
                failedCount++;
            }
            if (failedCount >= failedGrades) {
                isFailed = false;
                System.out.println("You need a break, " + failedCount + " poor grades.");
                break;
            }
            if (counter > counter - 1) {
                last = subject;
            }
            subject = scanner.nextLine();
        }
        double average = totalGrades / counter;
        if (isFailed) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.println("Number of problems: " + counter);
            System.out.println("Last problem: " + last);
        }
    }
}