
import java.util.Random;
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

    public static void soundIntensity(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double soundPower;
        double distanceTraveled;

        soundPower = scnr.nextDouble();
        distanceTraveled = scnr.nextDouble();

        double soundIntensity = soundPower / (4.0 * Math.PI * (distanceTraveled * distanceTraveled));

        System.out.printf("Sound wave intensity is %.3f\n", soundIntensity);

    }

    public static void gravityCalculator(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double G = 6.673e-11;
        double M = 5.98e24;
        double accelGravity;
        double distCenter;

        distCenter = scnr.nextDouble();

        accelGravity = (G * M) / (distCenter * distCenter);

        System.out.println(accelGravity);
    }

    public static void mathMethods(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double p;
        double q;
        double r;

        p = scnr.nextDouble();
        q = scnr.nextDouble();

        r = Math.sqrt(Math.abs(p) + Math.abs(q));

        System.out.printf("r = %.2f\n", r); // Outputs r with 2 decimal places
    }

    public static void mathOperators(String[] args) {
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

    public static void averageFamilySize(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numChildrenA;
        int numChildrenB;
        int numFamilies;
        double avgFamilies;

        numChildrenA = scnr.nextInt();
        numChildrenB = scnr.nextInt();
        numFamilies = scnr.nextInt();

        avgFamilies = ((double) (numChildrenA) + (numChildrenB)) / numFamilies;

        System.out.printf("%.2f\n", avgFamilies);

    }

    public static void wordGame(String[] args
    ) {
        Scanner scnr = new Scanner(System.in);
        String wordRelative;
        String wordFood;
        String wordAdjective;
        String wordTimePeriod;
        // Get user's words
        System.out.println("Provide input without spaces.");

        System.out.println("Enter a kind of relative: ");
        wordRelative = scnr.next();

        System.out.println("Enter a kind of food: ");
        wordFood = scnr.next();

        System.out.println("Enter an adjective: ");
        wordAdjective = scnr.next();

        System.out.println("Enter a time period: ");
        wordTimePeriod = scnr.next();

        // Tell the story
        System.out.println();
        System.out.print("My " + wordRelative);
        System.out.println(" says eating " + wordFood);
        System.out.println("will make me more " + wordAdjective + ",");
        System.out.println("so now I eat it every " + wordTimePeriod + ".");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int seedVal;
        int lowerBound;
        int upperBound;
        int pick1;
        int pick2;
        int pick3;

        seedVal = scnr.nextInt();
        lowerBound = scnr.nextInt();
        upperBound = scnr.nextInt();

        randGen.setSeed(seedVal);

        pick1 = randGen.nextInt(upperBound - lowerBound + 1) + lowerBound;
        pick2 = randGen.nextInt(upperBound - lowerBound + 1) + lowerBound;
        pick3 = randGen.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println(pick1);
        System.out.println(pick2);
        System.out.println(pick3);
    }
}
