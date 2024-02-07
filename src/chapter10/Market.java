package chapter10;

public class Market {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.calories);
        apple.makeJuice();
        buySomeFruits(apple);
        
        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();
        buySomeFruits(banana);
        
        System.out.println("--- From the superclass ----");
        Fruits fruit = new Apple();
        // here the calories printed is the one of the superclass
        System.out.println(fruit.calories);
        // prints the calories of the subclass
        System.out.println(((Apple) fruit).calories);
        
        // to call the method of the subclass, we type-cast
        ((Apple) fruit).removeSeeds();
        
        // calls subclass method of makeJuice
        fruit.makeJuice();
        buySomeFruits(fruit);
        
        // change the type of fruit
        fruit = new Banana();
        // here the calories printed is the one of the superclass
        System.out.println(fruit.calories);
        
        // type-cast to call subclass methods
        ((Banana) fruit).peel();
        
        // calls subclass method of makeJuice
        fruit.makeJuice();
        buySomeFruits(fruit);
    }
    
    public static void buySomeFruits(Fruits fruit) {
        if (fruit instanceof Apple) {
            System.out.println("Hey! I bought some apples");
        } else if (fruit instanceof Banana) {
            System.out.println("Hey! Here are some bananas for ya.");
        }
    }
}
