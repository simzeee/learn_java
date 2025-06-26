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

  public static void sound_Intensity(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double soundPower;
    double distanceTraveled;

    soundPower = scnr.nextDouble();
    distanceTraveled = scnr.nextDouble();

    double soundIntensity = soundPower / (4.0 * Math.PI * (distanceTraveled * distanceTraveled));

    System.out.printf("Sound wave intensity is %.3f\n", soundIntensity);

  }

  public static void gravity_calculation(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double G = 6.673e-11;
    double M = 5.98e24;
    double accelGravity;
    double distCenter;

    distCenter = scnr.nextDouble();

    accelGravity = (G * M) / (distCenter * distCenter);

    System.out.println(accelGravity);
  }

  public static void math_methods(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double p;
    double q;
    double r;

    p = scnr.nextDouble();
    q = scnr.nextDouble();

    r = Math.sqrt(Math.abs(p) + Math.abs(q));

    System.out.printf("r = %.2f\n", r); // Outputs r with 2 decimal places
  }

  public static void math_operators(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int totalYears;
    int numMillennia;
    int numCenturies;
    int numYears;

    totalYears = scnr.nextInt();

    numMillennia = totalYears / 1000;
    numCenturies = (totalYears / 100) % 10;
    numYears = totalYears % 100;

    System.out.println("Millennia: " + numMillennia);
    System.out.println("Centuries: " + numCenturies);
    System.out.println("Years: " + numYears);
  }
}
