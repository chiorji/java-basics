package chapter5;

import java.util.Scanner;

/*
 * Calculate the final total fo someone's cellphone bill.
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create separate method to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 * */
public class PhoneBillCalculator {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        scanner.close();

        double overageCharge = calculateOverageCharge(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);
    }

    public static double calculateOverageCharge(double overageMinutes) {
        double rate = 0.5;
        return overageMinutes * rate;
    }

    public static double calculateTax(double subtotal) {
        double rate = 0.5;
        return subtotal * rate;
    }

    public static void calculateAndPrintBill(double base, double overage, double tax) {
        double total = base + overage + tax;

        System.out.println("Phone bill statement");

        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
