package chapter10;

public class Apple extends Fruits {
    final double calories = 4;
    
    public void removeSeeds() {
        System.out.println("apple seeds are removed");
    }
    
    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made, and it has " + calories + " amount of calories");
    }
}
