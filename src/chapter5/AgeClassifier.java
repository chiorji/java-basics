package chapter5;

import java.util.Scanner;
/*
* The federal government has just employed you as their programmer.
* The federal government wants you to classify Every citizen into various
* groups and the groups are infant (0-12), teenagers (13-19),Youth (20-29),
* Adult (30-above). You're going to develop a system that will ask the user
* to input their age, and it would display their class.
* */
public class AgeClassifier {
    // list known variables
    static int youth = 30;
    static int teenager = 20;
    static int infant = 13;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        int age = getUserAge();
        String ageGroup = evaluateUserAgeGroup(age);
        scanner.close();
        displayUserAgeGroup(ageGroup);
    }
    // request age
    public static int getUserAge(){
        System.out.println("Please provide your age: ");
        return scanner.nextInt();
    }

    // determine user's age group
    public static String evaluateUserAgeGroup(int age){
        String ageGroup;
        if(age < infant){
            ageGroup = "Infant";
        } else if(age < teenager){
            ageGroup = "Teenager";
        } else if(age < youth){
            ageGroup = "Youth";
        } else {
            ageGroup = "Adult";
        }
        return ageGroup;
    }

    // Display result
    public static void displayUserAgeGroup(String ageGroup){
        System.out.println("Your age group is: " + ageGroup);
    }
}
