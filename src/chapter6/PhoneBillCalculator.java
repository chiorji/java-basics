package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] arg){
        PhoneBill bill = new PhoneBill(123);
        bill.setUsedMinutes(4000);
        bill.printBillingInformation();
    }
}
