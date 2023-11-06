package chapter5;

import java.util.Scanner;

/*
* Employed into a company and the company always give charge.
* 0.5% for every loan from 0-20k
* 1.2% for 20k-50k
* 1.9% for 50k and above
* Build a calculator that will calculate the simple interest
* */
public class SimpleInterestCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        double principal  = getPrincipalAmount();
        int duration = getDurationInYears();
        double rate = determineInterestRate(principal);
        double simpleInterest = calculateSimpleInterest(principal, rate, duration);
        double totalAmount = calculateTotalAmount(principal, simpleInterest);
        // close input stream
        scanner.close();
        notifyUser(principal, duration, rate, simpleInterest, totalAmount);
    }

    public static double getPrincipalAmount(){
        System.out.println("Enter principal amount: ");
        return scanner.nextDouble();
    }

    public static int getDurationInYears(){
        System.out.println("Enter time in years: ");
        return scanner.nextInt();
    }
    public static double calculateSimpleInterest(double principal, double rate, int time){
        // S.I = principal * rate * time
        return principal * rate * time;
    }

    // Determine the interest rate
    public static double determineInterestRate(double principal) {
        double interestRate;
        if(principal < 20000) {
            interestRate = 0.5;
        } else if (principal < 50000){
            interestRate = 1.2;
        } else interestRate = 1.9;
        return interestRate;
    }

    public static double calculateTotalAmount(double principal, double simpleInterest) {
        // A = P + S.I;
        return principal + simpleInterest;
    }

    // p=principal, d=duration, r=rate, si=simple interest, a=pay back amount
    public static void notifyUser(double p, double d, double r, double si, double a){
        System.out.println("Principal: " + p);
        System.out.println("Duration: " + d + "year(s)");
        System.out.println("Rate: " + r + "%");
        System.out.println("Simple Interest: " + si);
        System.out.println("Pay back amount: " + a);
    }
}
