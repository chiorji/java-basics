package chapter2;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main(String[] arg) {
//        1. Ask for the season the year
        System.out.println("What season of the year is it? ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

//        2. Ask for quantity
        System.out.println("What is the quantity? ");
        int quantity = scanner.nextInt();

//        3. Provide an adjective
        System.out.println("Supply an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drank a minimum of " + quantity + " cups of coffee.");
    }
}
