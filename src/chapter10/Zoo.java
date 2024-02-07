package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        
        feed(rocky);
        
        Animal sasha = new Dog();
        sasha.makeSound();
        
        feed(sasha);
        
        // could change sasha to a new type since it has the same base class
        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);
        
        // sasha can not call the Cat method directly since it is of type Animal and Cat methods are specific to type Cat
        // But we can call the Cat methods on sasha by type-casting
        ((Cat) sasha).scratch();
        feed(sasha);
    }
    
    // The method below accepts Animal arguments, so any subclasses of animal could be passed as a parameter
    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here is your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }
    }
}
