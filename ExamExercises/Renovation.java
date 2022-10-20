package ExamExercises;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        int totalArea = height * width * 4;
        double wallsToPaint = Math.ceil(totalArea - totalArea * percent / 100.00);
        String pesho = scanner.nextLine();
        boolean left = true;
        while (!pesho.equals("Tired!")) {
            int paint = Integer.parseInt(pesho);
            wallsToPaint -= paint;
            if (wallsToPaint <= 0) {
                left = false;
                if (wallsToPaint == 0) {
                    System.out.println("All walls are painted! Great job, Pesho!");
                } else {
                    System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(wallsToPaint));
                }
                break;
            }
            pesho = scanner.nextLine();
        }
        if (left) {
            System.out.printf("%.0f quadratic m left.", wallsToPaint);
        }
    }
}