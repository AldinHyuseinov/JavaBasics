package Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        double total = 0.0;
        int musalaPeople = 0;
        int monblanPeople = 0;
        int kilimandjaroPeople = 0;
        int k2People = 0;
        int everestPeople = 0;
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            total += people;
            if (people > 0 && people <= 5) {
                musalaPeople += people;
            } else if (people >= 6 && people <= 12) {
                monblanPeople += people;
            } else if (people >= 13 && people <= 25) {
                kilimandjaroPeople += people;
            } else if (people >= 26 && people <= 40) {
                k2People += people;
            } else {
                everestPeople += people;
            }
        }
        double musalaClimbers = musalaPeople / total * 100;
        double monblanClimbers = monblanPeople / total * 100;
        double kilimandjaroClimbers = kilimandjaroPeople / total * 100;
        double k2Climbers = k2People / total * 100;
        double everestClimbers = everestPeople / total * 100;
        System.out.printf("%.2f%%%n", musalaClimbers);
        System.out.printf("%.2f%%%n", monblanClimbers);
        System.out.printf("%.2f%%%n", kilimandjaroClimbers);
        System.out.printf("%.2f%%%n", k2Climbers);
        System.out.printf("%.2f%%%n", everestClimbers);
    }
}