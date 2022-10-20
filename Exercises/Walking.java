package Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        String home = null;
        while (total < 10000 && !"Going home".equals(home = scanner.nextLine())) {
            total += Integer.parseInt(home);
        }
        if ("Going home".equals(home)) {
            total += Integer.parseInt(scanner.nextLine());
        }
        if (total >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.println(total - 10000 + " steps over the goal!");
        } else {
            System.out.println(10000 - total + " more steps to reach goal.");
        }
    }
}