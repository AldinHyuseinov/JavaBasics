package MoreExercises;

import java.util.Scanner;

public class Pipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double first = p1 * h;
        double second = p2 * h;
        double total = first + second;
        if (total <= v) {
            double filled = total * 100 / v;
            double firstPipe = first * 100 / total;
            double secondPipe = second * 100 / total;
            System.out.println("The pool is " + String.format("%.2f", filled) + "%" + " full." + " Pipe 1: " + String.format("%.2f", firstPipe) + "%." + " Pipe 2: " + String.format("%.2f", secondPipe) + "%.");
        } else {
            double over = total - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, over);
        }
    }
}