package Exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= 1 && num < 200) {
                int p1Numbers = 0;
                p1Numbers++;
                p1 += p1Numbers / n * 100;
            } else if (num >= 200 && num <= 399) {
                int p2Numbers = 0;
                p2Numbers++;
                p2 += p2Numbers / n * 100;
            } else if (num >= 400 && num <= 599) {
                int p3Numbers = 0;
                p3Numbers++;
                p3 += p3Numbers / n * 100;
            } else if (num >= 600 && num <= 799) {
                int p4Numbers = 0;
                p4Numbers++;
                p4 += p4Numbers / n * 100;
            } else {
                int p5Numbers = 0;
                p5Numbers++;
                p5 += p5Numbers / n * 100;
            }
        }
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}