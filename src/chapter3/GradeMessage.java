package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] arg) {
        // Get letter grade
        System.out.print("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a lil hard.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Invalid grade.";
                break;
        }

        System.out.println(message);
    }
}
