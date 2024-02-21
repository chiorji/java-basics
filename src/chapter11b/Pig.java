package chapter11b;

public class Pig extends Animal {
    private String name;
    
    public Pig(String name) {
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
        System.out.println("Grunt! grunt!! grunt!!!");
    }
}
