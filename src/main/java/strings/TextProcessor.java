package strings;

import java.util.Arrays;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("Hello magnolia perlamone");
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words.",numberOfWords);
        System.out.println(message);
        for (String word : words){
            System.out.println(word);
        }
    }

    public static void reverseString(String text){
        var words = text.split(" ");
        for (int i = words.length; i > 0; i--){

            var w = words[i - 1].split("");
            System.out.println(w);
            break;
        }
    }
}
