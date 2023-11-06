package chapter5;

import java.util.Scanner;

public class AgeGroupClassifier {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        int userAge = getUserAge();
        String ageClass = determineUserAgeClass(userAge);
        // close input stream
        scanner.close();
        displayUserAgeClass(ageClass);
    }
    // request age
    public static int getUserAge(){
        System.out.println("Enter age: ");
        return scanner.nextInt();
    }

    // determine user's age group
    public static String determineUserAgeClass(int userAge){
        String ageClass;
        if(userAge < 13){
            ageClass = "Infant";
        } else if(userAge < 20){
            ageClass = "Teenager";
        } else if(userAge < 30){
            ageClass = "Youth";
        } else {
            ageClass = "Adult";
        }
        return ageClass;
    }

    // display user age class
    public static void displayUserAgeClass(String ageClass){
        System.out.println("Your age class is: " + ageClass);
    }
}
