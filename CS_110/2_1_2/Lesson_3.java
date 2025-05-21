import java.util.Scanner;

public class Lesson_3 {
  public static void averageWeight(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int cheetahPounds = 65;
    int goatPounds = 75;
    int penguinPounds = 72;
    int numCheetahs;
    int numGoats;
    int numPenguins;
    int averageWeight;
    int sumWeight;

    numCheetahs = scnr.nextInt();
    numGoats = scnr.nextInt();
    numPenguins = scnr.nextInt();

    sumWeight = (cheetahPounds * numCheetahs) + (goatPounds * numGoats) + (penguinPounds * numPenguins);
    averageWeight = sumWeight / (numCheetahs + numGoats + numPenguins);

    System.out.println("Average weight: " + averageWeight);
  }
}
