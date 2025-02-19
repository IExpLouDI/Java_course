package strings;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
        System.out.println("\n");
        reverseString("Hello magnolia perlamone");
        System.out.println("\n");
        addSpaces("HannaMantanna!I'alBeBack!");
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

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i<modifiedText.length(); i++){
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);

    }
}
