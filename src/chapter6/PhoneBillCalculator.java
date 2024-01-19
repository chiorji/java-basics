package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] arg){
        PhoneBill bill = new PhoneBill(123);
//        bill.setUsedMinutes(4000);
        bill.printBillingInformation();
        System.out.println("Bill 1 Allotted minutes: " + String.format("%d", bill.getAllottedMinutes()));

        PhoneBill bill2 = new PhoneBill(1234, 15, 200, 150);
        bill2.printBillingInformation();
        System.out.println("Bill 2 Allotted minutes: " + String.format("%d", bill2.getAllottedMinutes()));
    }
}
