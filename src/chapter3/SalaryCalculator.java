package chapter3;

/*
 * IF Statement
 * All salesperson get a payment of $1000 a week
 * Salesperson who exceeds 10 sales get an additional bonus of $250
 * */

import java.util.Scanner;

/*
 * If Statement
 * If a certain situation occurs, do <something> and then
 * go back to the main flow
 *
 * A decision structure that executes statement(s) given some condition is met
 * */
public class SalaryCalculator {
    public static void main(String[] arg) {
        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown
        System.out.println("How many sales did the salesperson make this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        scanner.close();

        // Quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }

        // Output
        System.out.println("The salesperson's pay is $" + salary);
    }
}
