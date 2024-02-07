package chapter10;

public class Banana extends Fruits {
    final protected double calories = 10;
    
    public void peel() {
        System.out.println("banana back is peeled off");
    }
    
    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made with " + calories + " amount of calories");
    }
}
