
import java.util.Scanner;

public class Lesson_5 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputItem;
        int foodStock;

        inputItem = scnr.next();

        while (!inputItem.equals("Done")) {
            foodStock = scnr.nextInt();

            if (foodStock < 40) {
                System.out.println(inputItem + ": low on stock");
            } else {
                System.out.println(inputItem + ": well stocked");
            }
            inputItem = scnr.next();
        }
        scnr.close();
    }

    public static void compareNums(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currentNum;
        int previousNum;

        previousNum = scnr.nextInt();
        currentNum = scnr.nextInt();
        System.out.println("Sequence starts at " + previousNum + ".");

        while (currentNum >= previousNum) {
            System.out.println(currentNum + " is greater than or equal to " + previousNum + ". Sequence is not decreasing.");
            previousNum = currentNum;
            currentNum = scnr.nextInt();
        }

        System.out.println(currentNum + " breaks the sequence.");

    }

    public static void nestedLoops(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        int currentRowInteger;
        int currentColumn;
        char currentColumnLetter;

        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();

        for (currentRow = 1; currentRow <= numRows; ++currentRow) {

            for (currentColumn = 1; currentColumn <= numColumns; ++currentColumn) {
                char letter = (char) ('A' + currentColumn - 1);
                System.out.print("" + currentRow + letter + " ");
            }
            System.out.println();
        }

    }
}
