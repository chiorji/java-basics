package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes moe than $25,000 and have a credit score
 * of 700 or better. Reject all others.
 * */
public class InstantCreditCheck {
    // Initialize known variables
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {

        // Get unknown variables from user
        double salary = getSalary();
        int creditScore = getCreditScore();

        // close input stream
        scanner.close();

        // Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        // Notify the user
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your salary:");
        return scanner.nextDouble();
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        return scanner.nextInt();
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        return creditScore >= requiredCreditScore && salary >= requiredSalary;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("Congrats! You've been approved.");
        } else {
            System.out.println("Sorry, you've been declined");
        }
    }
}
