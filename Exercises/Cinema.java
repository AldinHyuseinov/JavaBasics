package Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        switch (type) {
            case "Premiere":
                sum = rows * columns * 12;
                break;
            case "Normal":
                sum = rows * columns * 7.50;
                break;
            case "Discount":
                sum = rows * columns * 5;
                break;
        }
        System.out.printf("%.2f leva", sum);
    }
}
