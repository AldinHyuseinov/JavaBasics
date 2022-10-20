package ExamExercises;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggs = Integer.parseInt(scanner.nextLine());
        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;
        int max = Integer.MIN_VALUE;
        String best = "";
        for (int i = 1; i <= eggs; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    redCount++;
                    break;
                case "orange":
                    orangeCount++;
                    break;
                case "blue":
                    blueCount++;
                    break;
                case "green":
                    greenCount++;
                    break;
            }
            if (redCount > max) {
                max = redCount;
                best = color;
            } else if (orangeCount > max) {
                max = orangeCount;
                best = color;
            } else if (blueCount > max) {
                max = blueCount;
                best = color;
            } else if (greenCount > max) {
                max = greenCount;
                best = color;
            }
        }
        System.out.println("Red eggs: " + redCount);
        System.out.println("Orange eggs: " + orangeCount);
        System.out.println("Blue eggs: " + blueCount);
        System.out.println("Green eggs: " + greenCount);
        System.out.printf("Max eggs: %d -> %s", max, best);
    }
}