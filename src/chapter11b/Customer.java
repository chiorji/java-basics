package chapter11b;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setPrice(9.99);
        book.setName("Thing's Fall Apart");
        
        System.out.println("Price: " + book.getPrice());
        System.out.println("Name: " + book.getName());
        System.out.println("Barcode: " + book.getBarCode());
    }
}
