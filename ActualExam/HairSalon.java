package ActualExam;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int sum = 0;
        boolean isClose = true;
        while (!command.equals("closed")) {
            String types = scanner.nextLine();
            if (command.equals("haircut")) {
                if (types.equals("mens")) {
                    sum += 15;
                } else if (types.equals("ladies")) {
                    sum += 20;
                } else {
                    sum += 10;
                }
            } else {
                if (types.equals("touch up")) {
                    sum += 20;
                } else {
                    sum += 30;
                }
            }
            if (sum >= goal) {
                isClose = false;
                System.out.println("You have reached your target for the day!");
                System.out.println("Earned money: " + sum + "lv.");
                break;
            }
            command = scanner.nextLine();
        }
        if (isClose) {
            System.out.println("Target not reached! You need " + (goal - sum) + "lv. more.");
            System.out.println("Earned money: " + sum + "lv.");
        }
    }
}
