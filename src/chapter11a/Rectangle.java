package chapter11a;

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getWidth(){
        return width;
    }
    
    @Override
    double calculateArea() {
        return length * width;
    }
}
