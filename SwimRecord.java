import java.util.Scanner;

public class SwimRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double swim = distance * time;
        double add = Math.floor(distance / 15);
        double add2 = add * 12.5;
        double totalTime = swim + add2;
        if (record <= totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}