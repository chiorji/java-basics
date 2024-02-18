package chapter11a;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rect = new Rectangle(12.06, 6.803);
        double area = rect.calculateArea();
        rect.print();
        System.out.println("Area: " + area);
    }
}
