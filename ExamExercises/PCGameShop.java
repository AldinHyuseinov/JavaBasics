package ExamExercises;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int heartCount = 0;
        int fortCount = 0;
        int overCount = 0;
        int otherCount = 0;
        for (int i = 1; i <= n; i++) {
            String game = scanner.nextLine();
            if (game.equals("Hearthstone")) {
                heartCount++;
            } else if (game.equals("Fornite")) {
                fortCount++;
            } else if (game.equals("Overwatch")) {
                overCount++;
            } else {
                otherCount++;
            }
        }
        double average1 = heartCount * 100.00 / n;
        double average2 = fortCount * 100.00 / n;
        double average3 = overCount * 100.00 / n;
        double average4 = otherCount * 100.00 / n;
        System.out.printf("Hearthstone - %.2f%%%n", average1);
        System.out.printf("Fornite - %.2f%%%n", average2);
        System.out.printf("Overwatch - %.2f%%%n", average3);
        System.out.printf("Others - %.2f%%%n", average4);
    }
}