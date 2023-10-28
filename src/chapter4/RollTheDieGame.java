package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] arg) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.print("Welcome to Roll The Die! Let's begin...");

        for (int i = 0; i < maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.printf("Roll die #%d. You've rolled a %d.%n", i, die);

            if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats! You w1n!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            } else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + lastSpace + " spaces. You lose!");
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }
            System.out.println();
        }
    }
}
