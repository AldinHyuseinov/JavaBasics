import java.util.Scanner;

public class Literature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesReadInAHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int timeToRead = pages / pagesReadInAHour;
        int neededTime = timeToRead / days;
        System.out.println(neededTime);
    }
}
