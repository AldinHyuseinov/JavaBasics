package Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double currentTotal = 0.0;
        double total = 0.0;
        int nameCount = 0;
        while (!name.equals("Finish")) {
            nameCount++;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentTotal += grade;
                total += grade;
            }
            currentTotal /= n;
            System.out.printf("%s - %.2f.%n", name, currentTotal);
            currentTotal = 0.0;
            name = scanner.nextLine();
        }
        total /= n * nameCount;
        System.out.printf("Student's final assessment is %.2f.", total);
    }
}