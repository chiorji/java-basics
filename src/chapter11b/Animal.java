package chapter11b;

public abstract class Animal {
    abstract public void makeSound();
    abstract void setName(String name);
    abstract String getName();
    
    public void eat(String name) {
        System.out.println(name + " is an animal, and it is eating.");
    }
}
