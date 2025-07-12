
import java.util.Scanner;

public class Lesson_6 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElems;
        int[] studentNumbers;
        int i;
        boolean firstSmaller;

        numElems = scnr.nextInt();

        studentNumbers = new int[numElems];
        for (i = 0; i < studentNumbers.length; ++i) {
            studentNumbers[i] = scnr.nextInt();
        }

        if (studentNumbers[0] < studentNumbers[studentNumbers.length - 1]) {
            firstSmaller = true;
        } else {
            firstSmaller = false;
        }

        if (firstSmaller) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("First element is not less than last element");
        }
    }

    public static void numInputArray(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElems;
        int i;

        numElems = scnr.nextInt();
        int[] patientNumbers = new int[numElems];
        int numInput;
        for (i = 0; i < patientNumbers.length; ++i) {
            numInput = scnr.nextInt();
            patientNumbers[i] = numInput;
        }

        System.out.print("Array contents: ");
        for (i = 0; i < patientNumbers.length; ++i) {
            System.out.print(patientNumbers[i] + " ");
        }
        System.out.println();
    }

    public static void assignArrayValues(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 5;
        int[] totalNumbersList = new int[NUM_VALS];
        int i;

        for (i = 0; i < totalNumbersList.length; ++i) {
            totalNumbersList[i] = scnr.nextInt();
        }

        int[] fourthNumbersList = new int[NUM_VALS];
        for (i = 0; i < fourthNumbersList.length; ++i) {
            fourthNumbersList[i] = totalNumbersList[i] / 4;
        }

        for (i = 0; i < fourthNumbersList.length; ++i) {
            System.out.print(fourthNumbersList[i] + " ");
        }
        System.out.println();
    }

    public static void compareAndAssignArrayValues(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 4;
        int[] valuesA = new int[NUM_VALS];
        int[] valuesB = new int[NUM_VALS];
        int[] largerValues = new int[NUM_VALS];
        int i;

        for (i = 0; i < valuesA.length; ++i) {
            valuesA[i] = scnr.nextInt();
        }

        for (i = 0; i < valuesB.length; ++i) {
            valuesB[i] = scnr.nextInt();
        }

        for (i = 0; i < valuesA.length; ++i) {
            if (valuesA[i] > valuesB[i]) {
                largerValues[i] = valuesA[i];
            } else {
                largerValues[i] = valuesB[i];
            }
        }

        for (i = 0; i < largerValues.length; ++i) {
            System.out.print(largerValues[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_VALS = 5;
        int[] groceryItemPrices = new int[NUM_VALS];
        int[] quantityOrdered = new int[NUM_VALS];
        int i;

        for (i = 0; i < groceryItemPrices.length; ++i) {
            groceryItemPrices[i] = scnr.nextInt();
        }

        for (i = 0; i < quantityOrdered.length; ++i) {
            quantityOrdered[i] = scnr.nextInt();
        }

        for (i = 0; i < quantityOrdered.length; ++i) {

            if (quantityOrdered[i] % 2 == 0) {
                System.out.print(groceryItemPrices[i] + " ");
            }

        }
        System.out.println();

    }
}
