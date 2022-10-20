package ExamExercises;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clients = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        double total = 0.0;
        int count = 0;
        for (int i = 1; i <= clients; i++) {
            String item = scanner.nextLine();
            while (!item.equals("Finish")) {
                if (item.equals("basket")) {
                    sum += 1.50;
                } else if (item.equals("wreath")) {
                    sum += 3.80;
                } else {
                    sum += 7;
                }
                count++;
                item = scanner.nextLine();
            }
            if (count % 2 == 0) {
                sum -= sum * 0.20;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", count, sum);
            total += sum;
            sum = 0.0;
            count = 0;
        }
        total /= clients;
        System.out.printf("Average bill per client is: %.2f leva.", total);
    }
}