package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] arg) {
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do {
            // Get the test score
            System.out.print("Enter your test score:");
            double score = scanner.nextDouble();
            // Determine the letter grade
            char grade;
            if (score < 40) {
                grade = 'F';
            } else if (score < 45) {
                grade = 'E';
            } else if (score < 50) {
                grade = 'D';
            } else if (score < 60) {
                grade = 'C';
            } else if (score < 70) {
                grade = 'B';
            } else {
                grade = 'A';
            }
            System.out.println("Your grade is " + grade);
            // Ask user if they'd like to continue
            System.out.println("Do you wish to run again? True or False");
            again = scanner.nextBoolean();
        } while(again);
        scanner.close();
    }
}
