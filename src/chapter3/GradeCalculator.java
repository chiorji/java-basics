package chapter3;

import java.util.Scanner;

/*
* COS 261 ASSIGNMENT 2
Write an algorithm for a grading system such that a score is accepted from the user and
If score is within the range of 70 - 100, a grade of A should be returned as output.
If score is within the range of 60 - 69, a grade B should be returned as output.
If score is within the range of 50 - 59, a grade C is returned as output.
If score is within the range of 45 - 49, a grade of D is returned.
If the score entered is within the range of 40 - 44, a grade E is returned as output.
If the score is outside the range already specified, grade F should be returned as output.

Submission link:
https://docs.google.com/forms/d/e/1FAIpQLSdJQyARTTZU9McHKxEIHO71wgJG9IzteNTHwt17tWS8sDFjqg/viewform?usp=sf_link
* */
public class GradeCalculator {
    public static void main(String[] arg) {
        // Initialize known values
        // Grade A range 70-100
        int lowerGradeAScore = 70;
        int upperGradeAScore = 100;
        // Grade B range 60-69
        int lowerGradeBScore = 60;
        // Grade C range 50-59
        int lowerGradeCScore = 50;
        // Grade D range 45-49
        int lowerGradeDScore = 45;
        // Grade E range 40-44
        int lowerGradeEScore = 40;
        // Set default grade to F
        char grade;

        // Ask for the unknown values
        System.out.println("Enter student's score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        // Close read
        scanner.close();

        // Make decision
        if (score < upperGradeAScore) {
            if (score >= lowerGradeAScore) {
                grade = 'A';
            } else if (score >= lowerGradeBScore) {
                grade = 'B';
            } else if (score >= lowerGradeCScore) {
                grade = 'C';
            } else if (score >= lowerGradeDScore) {
                grade = 'D';
            } else if (score >= lowerGradeEScore) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Student's grade is: " + grade);
        } else {
            System.out.println("Oops! Score cannot be above the maximum required score.");
        }
    }
}
