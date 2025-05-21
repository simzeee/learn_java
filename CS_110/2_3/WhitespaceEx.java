import java.util.Scanner;

public class WhitespaceEx {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int myFirstVar; // Aligned comments yield less
      int yetAnotherVar; // visual clutter
      int thirdVar;

      // Above blank line separates variable declarations from the rest
      System.out.print("Enter a number: ");
      myFirstVar = scnr.nextInt();

      // Above blank line separates user input statements from the rest
      yetAnotherVar = myFirstVar; // Aligned = operators
      thirdVar = yetAnotherVar + 1;
      // Also notice the single-space on left and right of + and =
      // (except when aligning the second = with the first =)

      System.out.println("Final value is " + thirdVar); // Single-space on each side of +
   }
}