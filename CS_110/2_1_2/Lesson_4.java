
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

    public static void checkSides(String[] args) {
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

    public static void checkGroups(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int taskCount;
        int acceptedGroups;
        int invalidGroups;

        taskCount = scnr.nextInt();
        acceptedGroups = scnr.nextInt();
        invalidGroups = scnr.nextInt();

        if (taskCount <= 15) {
            acceptedGroups += 5;
        } else {
            invalidGroups += 6;
        }

        System.out.println(acceptedGroups);
        System.out.println(invalidGroups);
    }

    public static void checkInput(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numFolders;

        numFolders = scnr.nextInt();

        if (numFolders >= 134) {
            System.out.println("Too many files");
        } else if (numFolders >= 38) {
            System.out.println("Large file cabinet");
        } else if (numFolders > 0) {
            System.out.println("Mid-sized file cabinet");
        } else {
            System.out.println("Bad input");
        }

    }

    public static void checkTemp(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int fahr;

      fahr = scnr.nextInt();

      if(fahr <= 32){
      System.out.println("New state: solid");
         }
      else if((fahr > 32) && (fahr <= 212)){
         System.out.println("New state: liquid");
      }
      else{
         System.out.println("New state: gas");
      }
      

   }

}
