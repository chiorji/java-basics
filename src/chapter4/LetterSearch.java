package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a string to determine if it contains the letter A
 * */
public class LetterSearch {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        // Get text
        System.out.println("Enter some text: ");
        String text = scanner.next();

        // close input stream
        scanner.close();

        boolean letterFound = false;

        // Search text for letter A
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }
        if (letterFound) {
            System.out.println("This text contains the letter 'A'");
        } else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
