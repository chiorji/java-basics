package chapter8;

public class TextProcessor {
    public static void main(String[] arg){
//        countWords("I love Test Automation University");
//        reverseString("Hello TAU");
        addSpaces("HeyWorld!It'sMeKosiso");
    }

    /**
     * Split a String into an array by tokenizing it,
     * then count words and print them.
     * @param text String to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int wordCount = words.length;

        String message = String.format("Your text contains %d words", wordCount);
        System.out.println(message);

        // Print words using enhanced for-loop
        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to be reversed
     */
    public static void reverseString(String text){
        for(int i=text.length() -1; i>=0; i--){
            System.out.println(text.charAt(i));
        }
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for(int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
