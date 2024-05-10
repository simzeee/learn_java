import java.util.Scanner;

public class MyJavaApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String userName = scan.nextLine();

    String welcomeMessage = "Hello, " + userName + "! Welcome to the math quiz.";
    System.out.println(welcomeMessage);

    String question = "What is 3+2? ";
    System.out.print(question);
    String userAnswer = scan.nextLine();

    question = "What is 6/2? ";
    System.out.print(question);
    userAnswer = scan.nextLine();

    question = "What is 3*5? ";
    System.out.print(question);
    userAnswer = scan.nextLine();

    question = "What is 6-2? ";
    System.out.print(question);
    userAnswer = scan.nextLine();

    question = "What is 15/5? ";
    System.out.print(question);
    userAnswer = scan.nextLine();

    // Make a customized farewell message and print it.
    String farewellMessage = "Thanks for giving the quiz, " + userName + ". You will get your result soon.";
    System.out.println(farewellMessage);

  }
}