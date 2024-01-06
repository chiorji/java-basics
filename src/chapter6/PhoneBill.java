package chapter6;

public class PhoneBill {
    // Initialize known variables with
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    // Default method for creating bills
    public PhoneBill(){
        id = 0;
        baseCost = 11.55;
        allottedMinutes = 500;
        usedMinutes = 450;
    }

    // Method overloaded with bill id
    public PhoneBill(int id){
        this.id = id;
        baseCost = 11.55;
        allottedMinutes = 500;
        usedMinutes = 450;
    }

    // Method overloaded with other billing information
    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int minutes){
        usedMinutes = minutes;
    }

    public double calculateOverage(){
        if(usedMinutes <= allottedMinutes){
            return 0;
        }
        double overageRate = 0.15;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageRate * overageMinutes;
    }

    public double calculateTax(){
        double taxRate = 0.5;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printBillingInformation(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: " + baseCost);
        System.out.println("Overage Fee: " + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: " + String.format("%.2f", calculateTax()));
        System.out.println("Total: " + String.format("%.2f", calculateTotal()));
    }
}
