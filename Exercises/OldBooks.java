package Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        int counter = 0;
        String book;
        for (book = scanner.nextLine(); !book.equals(searchedBook); book = scanner.nextLine()) {
            counter++;
            if (book.equals("No More Books")) {
                counter--;
                System.out.println("The book you search is not here!");
                System.out.println("You checked " + counter + " books.");
                break;
            }
        }
        if (book.equals(searchedBook)) {
            System.out.println("You checked " + counter + " books and found it.");
        }
    }
}