
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

        if (fahr <= 32) {
            System.out.println("New state: solid");
        } else if ((fahr > 32) && (fahr <= 212)) {
            System.out.println("New state: liquid");
        } else {
            System.out.println("New state: gas");
        }
    }

    public static void checkYear(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int yearInput;

        yearInput = scnr.nextInt();

        if ((yearInput >= 1960) && (yearInput < 1970)) {
            System.out.println("The 60s");
        } else if ((yearInput >= 1970) && (yearInput < 1980)) {
            System.out.println("The 70s");
        } else if ((yearInput >= 1980) && (yearInput < 1990)) {
            System.out.println("The 80s");
        } else {
            System.out.println("Records not available for this input");
        }
    }

    public static void rangeSkip(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int orderedForks;

        orderedForks = scnr.nextInt();

        if (((orderedForks < 60) && (orderedForks > 35))) {
            System.out.println("Standard box");
        } else if (((orderedForks < 120) && (orderedForks >= 90))) {
            System.out.println("Full box");
        } else {
            System.out.println("Not efficient to ship");
        }

    }

    public static void annoying(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inString;

        inString = scnr.nextLine();

        if (Character.isLetter(inString.charAt(0)) && Character.isLetter(inString.charAt(1)) && Character.isLetter(inString.charAt(2))) {
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }

    }

    public static void highwayCheck(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;
        int servingNumber;
        boolean isNotValid;

        highwayNumber = scnr.nextInt();
        servingNumber = highwayNumber % 100;
        isNotValid = highwayNumber % 100 == 0;

        if ((highwayNumber < 1) || (highwayNumber > 999) || (isNotValid)) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
            return;
        }

        // indicate whether primary or auxillary
        if ((highwayNumber < 100)) {
            // if primary highway runs north/south or east/west
            if ((highwayNumber % 2) == 0) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            } else {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            }
        } // if auxillary indicate what primary highway it serves
        else {
            if ((servingNumber % 2) == 0) {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + servingNumber + ", going east/west.");
            } else {
                System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + servingNumber + ", going north/south.");
            }

        }

    }

    public static void countChange(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalPennies = scnr.nextInt();

        if (totalPennies < 1) {
            System.out.println("No change");
        }

        // compute each coin count by successive div/mod
        int dollars = totalPennies / 100;
        int rem = totalPennies % 100;

        int quarters = rem / 25;
        rem = rem % 25;

        int dimes = rem / 10;
        rem = rem % 10;

        int nickels = rem / 5;
        rem = rem % 5;

        int pennies = rem;
        // print with correct singular/plural
        if (dollars > 0) {
            System.out.println(
                    dollars
                    + (dollars == 1 ? " Dollar" : " Dollars")
            );
        }
        if (quarters > 0) {
            System.out.println(quarters + (quarters == 1 ? " Quarter" : " Quarters"));
        }
        if (dimes > 0) {
            System.out.println(dimes + (dimes == 1 ? " Dime" : " Dimes"));
        }
        if (nickels > 0) {
            System.out.println(nickels + (nickels == 1 ? " Nickel" : " Nickels"));
        }
        if (pennies > 0) {
            System.out.println(pennies + (pennies == 1 ? " Penny" : " Pennies"));
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear;

        isLeapYear = false;
        inputYear = scnr.nextInt();

        if ((inputYear % 4 == 0) && (inputYear % 100 != 0)) {
            isLeapYear = true;
        }
        if ((inputYear % 100 == 0) && (inputYear % 400 == 0)) {
            isLeapYear = true;
        }

        System.out.println(inputYear + (isLeapYear ? " - leap year" : " - not a leap year"));

    }
}
