package ActualExam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nights = Integer.parseInt(scanner.nextLine()) - 1;
        String room = scanner.nextLine();
        String grade = scanner.nextLine();
        double sum = 0.0;
        switch (room) {
            case "room for one person":
                sum = nights * 18;
                break;
            case "apartment":
                sum = nights * 25;
                if (nights < 9) {
                    sum -= sum * 0.30;
                } else if (nights >= 10 && nights <= 15) {
                    sum -= sum * 0.35;
                } else if (nights > 15) {
                    sum -= sum * 0.50;
                }
                break;
            case "president apartment":
                sum = nights * 35;
                if (nights < 9) {
                    sum -= sum * 0.10;
                } else if (nights >= 10 && nights <= 15) {
                    sum -= sum * 0.15;
                } else if (nights > 15) {
                    sum -= sum * 0.20;
                }
                break;
        }
        if (grade.equals("positive")) {
            sum += sum * 0.25;
        } else {
            sum -= sum * 0.10;
        }
        System.out.printf("%.2f", sum);
    }
}