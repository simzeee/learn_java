
import java.util.Scanner;

public class Lesson_4 {

    public static void controlFlow(String[] args) {
        int awardPoints;
        int userTickets;

        Scanner scnr = new Scanner(System.in);
        userTickets = scnr.nextInt(); // Program will be tested with values: 6, 7, 8, 9.

        if (userTickets != 7) {
            awardPoints = 10;
        } else {
            awardPoints = userTickets;
        }

        System.out.println(awardPoints);
    }

    public static void branch(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int goalCount;

        goalCount = scnr.nextInt();

        if (goalCount == 2) {
            System.out.println("Brace");
        } else if (goalCount == 3) {
            System.out.println("Hat-trick");
        } else {
            System.out.println("Other goal count");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numberOfSides;

        numberOfSides = scnr.nextInt();

        if (numberOfSides == 3) {
            System.out.println("Triangle");
        } else if (numberOfSides == 5) {
            System.out.println("Pentagon");
        } else if (numberOfSides == 6) {
            System.out.println("Hexagon");
        } else {
            System.out.println("Unexpected polygon");
        }

    }
}
