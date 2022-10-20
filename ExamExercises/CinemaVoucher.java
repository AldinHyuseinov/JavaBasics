package ExamExercises;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        int movies = 0;
        int products = 0;
        boolean end = true;
        String item = scanner.nextLine();
        while (value >= 0) {
            if (item.equals("End")) {
                end = false;
                System.out.println(movies);
                System.out.println(products);
                break;
            }
            int length = item.length();
            int letter = item.charAt(0);
            int total;
            int price;
            if (length > 8) {
                int letter2 = item.charAt(1);
                total = letter + letter2;
                if (value < total) {
                    end = false;
                    System.out.println(movies);
                    System.out.println(products);
                    break;
                }
                value -= total;
                movies++;
            } else if (length < 8) {
                price = letter;
                if (value < price) {
                    end = false;
                    System.out.println(movies);
                    System.out.println(products);
                    break;
                }
                value -= price;
                products++;
            }
            item = scanner.nextLine();
        }
        if (end) {
            System.out.println(movies);
            System.out.println(products);
        }
    }
}