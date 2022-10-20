import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int duration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        double lunchTime = breakDuration / 8.0;
        double chillTime = breakDuration / 4.0;
        double spareTime = breakDuration - lunchTime - chillTime;
        if (spareTime >= duration) {
            double timeLeft = Math.ceil(spareTime - duration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, timeLeft);
        } else {
            double needTime = Math.ceil(duration - spareTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, needTime );
        }
    }
}