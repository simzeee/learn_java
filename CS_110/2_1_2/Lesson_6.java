
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

    public static void outputEvenItems(String[] args) {
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

    public static void arrayModification(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] scoresList;
        double[] updatedList;
        int numElements;
        int i;

        numElements = scnr.nextInt();

        scoresList = new double[numElements];
        updatedList = new double[numElements];

        for (i = 0; i < scoresList.length; ++i) {
            scoresList[i] = scnr.nextDouble();
        }

        for (i = 0; i < updatedList.length; ++i) {
            if (i == 0) {
                updatedList[0] = scoresList[scoresList.length - 1];
            } else {
                updatedList[i] = scoresList[i - 1];
            }
        }

        System.out.print("Original scores: ");
        for (i = 0; i < scoresList.length; ++i) {
            System.out.printf("%.1f ", scoresList[i]);
        }
        System.out.println();

        System.out.print("Updated scores: ");
        for (i = 0; i < updatedList.length; ++i) {
            System.out.print(updatedList[i] + " ");
        }
        System.out.println();
    }

    public static void reverseInputArray(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed

        int num;

        numElements = scnr.nextInt();
        int[] inputList = new int[numElements];   // Input begins with number of integers that follow
        for (int i = 0; i < numElements; ++i) {
            num = scnr.nextInt();
            inputList[i] = num;
        }
        for (int i = inputList.length - 1; i >= 0; --i) {
            System.out.print(inputList[i] + ",");
        }
        System.out.println("");
    }

    public static void inputArrayComplicated(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];   // Set of data specified by the user      
        int userInput;
        int itemCount = 0;

        while (itemCount <= 10) {
            userInput = scnr.nextInt();
            if (userInput > 0) {
                itemCount += 1;
            } else {
                break;
            }
            if (itemCount < 9) {
                userValues[itemCount - 1] = userInput;
            }
        }

        if (itemCount > 9) {
            System.out.println("Too many numbers");
        }

        if (itemCount <= 9) {
            System.out.println("Middle item: " + userValues[(itemCount / 2)]);
        }

    }

    public static void normalizeInput(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalNumFloats = scnr.nextInt();
        double[] values = new double[totalNumFloats];
        double inputValue;
        double largestValue = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < values.length; ++i) {
            inputValue = scnr.nextDouble();
            if (i == 0) {
                largestValue = inputValue;
            } else if (inputValue > largestValue) {
                largestValue = inputValue;
            }
            values[i] = inputValue;
        }

        for (int i = 0; i < values.length; ++i) {
            System.out.printf("%.2f ", values[i] / largestValue);
        }

        System.out.println();

    }

    public static void countFrequency(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int totalNumWords = scnr.nextInt();

        String[] words = new String[totalNumWords];
        for (int i = 0; i < totalNumWords; i++) {
            words[i] = scnr.next();
        }

        // 2) count into freqs[]
        int[] freqs = new int[totalNumWords];
        for (int i = 0; i < totalNumWords; i++) {
            freqs[i] = 0;                        // start at zero
            for (int j = 0; j < totalNumWords; j++) {
                if (words[i].equals(words[j])) {
                    freqs[i]++;
                }
            }
        }

        // 3) print each word with its frequency
        for (int i = 0; i < totalNumWords; i++) {
            System.out.println(words[i] + " - " + freqs[i]);
        }

        scnr.close();
    }

    public static void wordContainsChar(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWords = scnr.nextInt();
        char charCheck;
        String inputWord;

        String[] inputWords = new String[numWords];

        for (int i = 0; i < inputWords.length; ++i) {
            inputWord = scnr.next();
            inputWords[i] = inputWord;
        }

        charCheck = scnr.next().charAt(0);

        for (int i = 0; i < inputWords.length; ++i) {
            if (inputWords[i].contains(String.valueOf(charCheck))) {
                System.out.print(inputWords[i] + ",");
            }
        }

        System.out.println();

    }
}
