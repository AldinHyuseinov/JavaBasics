package Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int total = width * length * height;
        String input = scanner.nextLine();
        int takenSpace = 0;
        while (total > takenSpace) {
            if (input.equals("Done")) {
                System.out.println(Math.abs(takenSpace - total) + " Cubic meters left.");
                break;
            }
            int luggage = Integer.parseInt(input);
            takenSpace += luggage;
            if (total < takenSpace) {
                System.out.println("No more free space! You need " + (takenSpace - total) + " Cubic meters more.");
            } else {
                input = scanner.nextLine();
            }
        }
    }
}