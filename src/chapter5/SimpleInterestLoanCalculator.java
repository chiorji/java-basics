package chapter5;

import java.util.Scanner;

/* PROBLEM STATEMENT
 * Employed into a company and the company always give charge.
 * 0.5% for every loan from 0-20k
 * 1.2% for 20k-50k
 * 1.9% for 50k and above
 * Build a calculator that will calculate the simple interest
 * */
public class SimpleInterestLoanCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        double principal  = getPrincipal();
        int duration = getTime();
        double rate = determineRate(principal);
        double simpleInterest = calculateInterest(principal, rate, duration);
        scanner.close();
        displayResult(principal, duration, rate, simpleInterest);
    }

    public static double getPrincipal(){
        System.out.println("Enter principal: ");
        return scanner.nextDouble();
    }

    public static int getTime(){
        System.out.println("Enter time(years): ");
        return scanner.nextInt();
    }
    public static double calculateInterest(double principal, double rate, int time){
        double simpleInterest =  principal * rate * time;
        return principal + simpleInterest;
    }

    public static double determineRate(double principal) {
        double interestRate;
        if(principal < 20000) {
            interestRate = 0.5;
        } else if (principal < 50000){
            interestRate = 1.2;
        } else interestRate = 1.9;
        return interestRate;
    }

    public static void displayResult(double principal, double time, double rate, double amount){
        System.out.println("Principal: " + principal);
        System.out.println("Time: " + time + "year(s)");
        System.out.println("Rate: " + rate + "%");
        System.out.println("Total Amount: " + amount);
    }
}
