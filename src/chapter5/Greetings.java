package chapter5;

import java.util.Scanner;

/*
 * Write a method that asks a user for their name, then greets them by name.
 * */
public class Greetings {
    public static void main(String[] arg) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        greetUser(name);
        scanner.close();
    }

    public static void greetUser(String name) {
        System.out.println("Hi there, " + name);
    }
}
