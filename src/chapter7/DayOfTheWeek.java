package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] DAYS_OF_THE_WEEK = {"Monday",
            "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static void main(String[] arg){
        int day = getDay();
        showWeekDay(day);
    }
    
    public static int getDay(){
        System.out.println("Enter a number for the day of the week");
        return scanner.nextInt();
    }

    public static void showWeekDay(int day){
        System.out.println("Corresponding day is: " + DAYS_OF_THE_WEEK[day - 1]);
    }
}
