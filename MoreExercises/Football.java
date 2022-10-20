package MoreExercises;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cap = Integer.parseInt(scanner.nextLine());
        double fans = Double.parseDouble(scanner.nextLine());
        double perA = 0.0;
        double perB = 0.0;
        double perV = 0.0;
        double perG = 0.0;
        for (int i = 1; i <= fans; i++) {
            String sectors = scanner.nextLine();
            switch (sectors) {
                case "A":
                    int aFans = 0;
                    aFans++;
                    perA += aFans / fans * 100;
                    break;
                case "B":
                    int bFans = 0;
                    bFans ++;
                    perB += bFans / fans * 100;
                    break;
                case "V":
                    int vFans = 0;
                    vFans ++;
                    perV += vFans / fans * 100;
                    break;
                case "G":
                    int gFans = 0;
                    gFans ++;
                    perG += gFans / fans * 100;
                    break;
            }
        }
        double perFan = fans / cap * 100;
        System.out.printf("%.2f%%%n", perA);
        System.out.printf("%.2f%%%n", perB);
        System.out.printf("%.2f%%%n", perV);
        System.out.printf("%.2f%%%n", perG);
        System.out.printf("%.2f%%%n", perFan);
    }
}