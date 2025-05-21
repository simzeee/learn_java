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

  public static void total_heart_beats(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int userAgeYears;
    int userAgeDays;
    int userAgeMinutes;
    int totalHeartbeats;
    int avgBeatsPerMinute = 72;

    System.out.print("Enter your age in years: ");
    userAgeYears = scnr.nextInt();

    userAgeDays = userAgeYears * 365; // Calculate days without leap years
    userAgeDays = userAgeDays + (userAgeYears / 4); // Add days for leap years

    System.out.println("You are " + userAgeDays + " days old.");

    userAgeMinutes = userAgeDays * 24 * 60; // 24 hours/day, 60 minutes/hour
    System.out.println("You are " + userAgeMinutes + " minutes old.");

    totalHeartbeats = userAgeMinutes * avgBeatsPerMinute;
    System.out.println("Your heart has beat " + totalHeartbeats + " times.");
  }
}
