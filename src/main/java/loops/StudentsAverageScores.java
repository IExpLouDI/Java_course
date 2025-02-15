package loops;

import java.util.Scanner;

// find the average test scores for each student in the class
public class StudentsAverageScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = 1;
        int testCount = 2;
        for (int i = 0; i < studentCount; i++){
            double total = 0;
            for (int j = 0; j < testCount; j++){
                System.out.println("Enter your score for test " + (j + 1));
                total = total + scanner.nextDouble();
            }
            double average = total / testCount;
            System.out.println("For student number " + (i + 1) +
                                ". Average value: " + average);
        }
        scanner.close();
    }
}
