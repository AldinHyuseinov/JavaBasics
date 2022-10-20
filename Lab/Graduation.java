package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());
        int count = 1;
        int grade1to12 = 1;
        double totalGrades = 0;
        while (grade1to12 <= 12) {
            if (grade < 4.00) {
                if (count >= 2) {
                    System.out.println(name + " has been excluded at " + grade1to12 + " grade");
                    break;
                }
                count++;
            } else {
                grade1to12++;
            }
            totalGrades += grade;
            if (grade1to12 <= 12) {
                grade = Double.parseDouble(scanner.nextLine());
            }
        }
        if (totalGrades >= 4.00 && count < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalGrades / 12);
        }
    }
}