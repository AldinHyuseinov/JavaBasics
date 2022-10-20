package ActualExam;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double total;
        double sum = m;
        for (int i = 1; i <= n; i++) {
            int per = Integer.parseInt(scanner.nextLine());
            total = m + m * per / 100;
            m = total;
            sum += total;
        }
        if (sum < 1000) {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - sum));
        } else {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(sum - 1000));
        }
    }
}