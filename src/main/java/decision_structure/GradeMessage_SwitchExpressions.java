package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            // Если одно действие, то без фигурных скобок
            case "A", "B" -> "Excellent job!";
//            case "B" -> "Great job!";
            // Если несколько действий, то в фигурных скобках
            // и на конце yield
            case "C" -> {
                System.out.println("lol");
                yield "Good job!";}
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade!";
        };

        System.out.println(message);
    }
}
