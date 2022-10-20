package MoreExercises;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String color;
        int points = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int otherColors = 0;
        for (int i = 1; i <= n; i++) {
            color = scanner.nextLine();
            switch (color) {
                case "red":
                    points += 5;
                    red++;
                    break;
                case "orange":
                    points += 10;
                    orange++;
                    break;
                case "yellow":
                    points += 15;
                    yellow++;
                    break;
                case "white":
                    points += 20;
                    white++;
                    break;
                case "black":
                    points /= 2;
                    black++;
                    break;
                default:
                    points += 0;
                    otherColors++;
                    break;
            }
        }
        System.out.println("Total points: " + points);
        System.out.println("Points from red balls: " + red);
        System.out.println("Points from orange balls: " + orange);
        System.out.println("Points from yellow balls: " + yellow);
        System.out.println("Points from white balls: " + white);
        System.out.println("Other colors picked: " + otherColors);
        System.out.println("Divides from black balls: " + black);
    }
}