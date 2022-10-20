package MoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        boolean pass = false;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                if (a >= b) {
                    continue;
                }
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        int control = a * b + c * d;
                        if (c > d) {
                            if (control == m) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                count++;
                            }
                            if (count == 4) {
                                pass = true;
                                n1 = a;
                                n2 = b;
                                n3 = c;
                                n4 = d;
                            }
                            if (pass) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        if (count < 4) {
            System.out.printf("%nNo!");
        }
        if (pass) {
            System.out.printf("%nPassword: %d%d%d%d", n1, n2, n3, n4);
        }
    }
}