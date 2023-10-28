package chapter4;

import java.util.Scanner;

/*
 * Write a Java code that performs addition, subtraction,
 * multiplication, division, and modulus operations on two
 * values and displays the results.
 * */
public class SimpleMath {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        // Initialize sentinel
        boolean runAgain;
        do {
            // Get the unknown values
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            double sub = num1 - num2;
            double div = num1 / num2;
            double mod = num1 % num2;

            // Output computation
            System.out.println("Addition: " + sum + "\nSubtraction: " + sub + "\n" +
                    "Division: " + div + "\nModulus: " + mod);

            // Ask if they would like to repeat process and update sentinel
            System.out.println("Would you like to start over? True or False");
            runAgain = scanner.nextBoolean();
        } while (runAgain);

        // close input stream
        scanner.close();
    }
}
