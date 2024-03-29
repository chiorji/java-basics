package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] arg){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;
            /*
            * Generate a random and make sure it's not already existing in the array
            * by searching through to find duplicates, if number exists
            * regenerate and search again.
            * */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNumber));

            // Number is unique if we get here, add it to the array
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        /*
         * This is called enhanced loop
         * It iterates through 'array' and each time assigns the current element to 'value'
         */
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        /*
        * If we've reached here, that means the entire array has
        * been searched and the value was not found
         */
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        // Sort array first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        return index >= 0;
    }

    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
