package MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int patients;
        int doctors = 7;
        int uncared = 0;
        int cared = 0;
        for (int i = 1; i <= days; i++) {
            patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (cared < uncared) {
                    doctors += 1;
                }
            }
            if (patients > doctors) {
                uncared += patients - doctors;
                cared += doctors;
            } else {
                cared += patients;
            }
        }
        System.out.println("Treated patients: " + cared + ".");
        System.out.println("Untreated patients: " + uncared + ".");
    }
}