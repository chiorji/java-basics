package chapter3;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);
    static String playerName;
    static int playerGuess;
    static int maxAttempt = 3;
    static int randomValue;
    static boolean correctGuess;
    public static void main(String[] arg) {
        playerName = getPlayerName();
        randomValue = generateRandomValue();
        do {
            playerGuess = getUserInput();
            correctGuess = isCorrectGuess(randomValue, playerGuess);
            checkGuessRange(randomValue, playerGuess, correctGuess);
            if(correctGuess) {
                System.out.println("Yah! That was a correct guess.");
                break;
            }
            maxAttempt--;
            if(maxAttempt == 0) {
                System.out.println(playerName + "," +
                        " you couldn't make the correct guess after several attempts. " +
                        "Try again.");
            }
        } while(maxAttempt > 0);

        scanner.close();
    }

    // Get player name
    public static String getPlayerName(){
        System.out.println("Enter your name:");
        return scanner.next();
    }
    // Get player guess
    public static int getUserInput(){
        System.out.println(playerName + ", guess a number between 0 and 10:");
        return scanner.nextInt();
    }

    // Generate random value
    public static int generateRandomValue(){
        Random random = new Random();
        return random.nextInt(10);
    }

    // Check guess correctness
    public static boolean isCorrectGuess(int randomValue, int playerGuess){
        return randomValue == playerGuess;
    }

    // Check guess range and give the player a hint
    public static void checkGuessRange(int randomValue, int playerGuess, boolean correctGuess){
        if (correctGuess) return;
        if (playerGuess > randomValue){
            System.out.println("Oops! Your guess is too high.");
        } else {
            System.out.println("Oops! Your guess is too low.");
        }
    }
}
