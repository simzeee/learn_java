
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
}
