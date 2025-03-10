package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    /**
     * Handling Multiple Excepttions
     * polymorphism
     * Multiple catch blocks
     * Catch multiple in single block
     */
    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Sorry, an error occurred. " + e.getMessage());
        }
    }
}
