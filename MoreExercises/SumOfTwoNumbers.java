package MoreExercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean stop = false;
        boolean no = true;
        for (int i = first; i <= last; i++) {
            for (int j = first; j <= last; j++) {
                count++;
                if (i + j == magic) {
                    stop = true;
                    no = false;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, i + j);
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
        if (no) {
            System.out.printf("%d combinations - neither equals %d", count, magic);
        }
    }
}