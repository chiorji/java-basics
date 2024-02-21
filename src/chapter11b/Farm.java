package chapter11b;

public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig("Pig");
        String pigName = pig.getName();
        pig.makeSound();
        pig.eat(pigName);
        
        System.out.println("-----------");
        
        Animal duck = new Duck("Duck");
        String duckName = duck.getName();
        duck.makeSound();
        duck.eat(duckName);
    }
}
