package chapter4;

import java.util.Scanner;

/*
 * Loops are structure that cause a block of code to repeat
 * WHILE LOOP
 * Each store employee makes $15 an hour, write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow over time.
 * */
public class GrossPayInputValidation {
    public static void main(String[] arg) {
        // Initialize known variables
        int rate = 15;
        int maxHours = 40;

        // Get input for unknown values
        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again!");
            hoursWorked = scanner.nextDouble(); // sentinel
        }

        // Close input stream
        scanner.close();

        // Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay is $" + gross);
    }
}
