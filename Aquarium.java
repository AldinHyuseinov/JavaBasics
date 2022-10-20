import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = length * width * height;
        double volumeInLitres = volume * 0.001;
        double calcPer = percent / 100;
        double neededVolume = volumeInLitres * (1 - calcPer);
        System.out.println(neededVolume);

    }
}
