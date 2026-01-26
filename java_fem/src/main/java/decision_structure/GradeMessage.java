package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job";
                break;
            case "B":
                message = "Good job";
                break;
            case "C":
                message = "Cs get degrees";
                break;
            case "D":
                message = "Maybe this isn't for you";
                break;
            case "F":
                message = "You are a failure";
                break;
            default:
                message = "Did you enter the right grade?";
                break;
        }
        System.out.println(message);
    }
}
