package chapter8;

public class Exercises {
    public static void main(String[] arg){
        convertDecimalsToInt();
    }

    public static void convertDecimalsToInt(){
        double[] numbers = {12.4, 1.5, 3.99, 45.5, 222.34};
        for(Double number : numbers) {
            System.out.println(number.intValue());
        }
    }
}
