package strings;

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
//        variant 1
        for (int i = text.length(); i > 0; i--){
            System.out.print(text.charAt(i - 1));
        }
//        variant 2
//        char[] chars = text.toCharArray();
//        for (int i = chars.length; i > 0; i--){
//            System.out.print(chars[i - 1]);
//        }
//        variant 3
//        var words = text.split(" ");
//        for (int i = words.length; i > 0; i--){
//            String reverse = new StringBuilder(words[i - 1]).reverse().toString();
//            System.out.print(reverse + " ");
//
//        }
    }
}
