package ExamExercises;

import java.util.Scanner;

public class OscarsWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        String room = scanner.nextLine();
        int boughtTickets = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        switch (movieName) {
            case "A Star Is Born":
                switch (room) {
                    case "normal":
                        sum = boughtTickets * 7.50;
                        break;
                    case "luxury":
                        sum = boughtTickets * 10.50;
                        break;
                    case "ultra luxury":
                        sum = boughtTickets * 13.50;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (room) {
                    case "normal":
                        sum = boughtTickets * 7.35;
                        break;
                    case "luxury":
                        sum = boughtTickets * 9.45;
                        break;
                    case "ultra luxury":
                        sum = boughtTickets * 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (room) {
                    case "normal":
                        sum = boughtTickets * 8.15;
                        break;
                    case "luxury":
                        sum = boughtTickets * 10.25;
                        break;
                    case "ultra luxury":
                        sum = boughtTickets * 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (room) {
                    case "normal":
                        sum = boughtTickets * 8.75;
                        break;
                    case "luxury":
                        sum = boughtTickets * 11.55;
                        break;
                    case "ultra luxury":
                        sum = boughtTickets * 13.95;
                        break;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movieName, sum);
    }
}