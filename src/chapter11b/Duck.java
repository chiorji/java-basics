package chapter11b;

public class Duck extends Animal {
    private String name;
    
    public Duck(String name){
        setName(name);
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void makeSound() {
        System.out.println("Quack! quack!! quack!!!");
    }
}
