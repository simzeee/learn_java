
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Lesson_2 {
  public void Salary() {
  }

  public static void int_multiply(String[] var0) {
    Scanner var2 = new Scanner(System.in);
    int var1 = var2.nextInt();
    System.out.print("Salary is ");
    System.out.println(var1 * 40 * 52);
  }

  public static void dog_years(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int dogYears;
    int humanYears;

    dogYears = scnr.nextInt();
    humanYears = 7 * dogYears;

    System.out.print(dogYears);
    System.out.print(" dog years is about ");
    System.out.print(humanYears);
    System.out.println(" human years.");
  }

  public static void driving_age(String[] args) {
    int drivingYear;
    int drivingAge;
    int numStates;

    drivingYear = 2014;
    drivingAge = 18;
    numStates = 10;

    System.out.println("In " + drivingYear + ", the driving age is " + drivingAge + ".");
    System.out.print(numStates + " states have exceptions.");
  }

  public static void salary(String[] args) {
    int wage;

    Scanner scnr = new Scanner(System.in);
    wage = scnr.nextInt();

    System.out.print("Salary is ");
    System.out.println(wage * 40 * 52);
  }

  public static void check_out(String[] args) {
    int userNum;

    userNum = 5;

    System.out.println("Predictions are hard.");
    System.out.print("Especially ");
    System.out.println("about the future.");
    System.out.println("Num is: " + userNum);

  }

  public static void WhitespaceEx(String[] args) {
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
