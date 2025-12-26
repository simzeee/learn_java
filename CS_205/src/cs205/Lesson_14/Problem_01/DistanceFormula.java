package cs205.Lesson_14.Problem_01;

import java.util.Scanner;

public class DistanceFormula {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double x1 = scnr.nextDouble();
        double y1 = scnr.nextDouble();
        double x2 = scnr.nextDouble();
        double y2 = scnr.nextDouble();

        System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
