import java.util.Scanner;

public class Minutes15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        if (minutes < 45) {
            System.out.printf("%d:%02d%n", hour, (minutes + 15));
        } else if (hour == 23) {
            System.out.printf("0:%02d%n", (minutes - 45));
        } else {
            System.out.printf("%d:%02d%n", (hour + 1), (minutes - 45));
        }
    }
}
