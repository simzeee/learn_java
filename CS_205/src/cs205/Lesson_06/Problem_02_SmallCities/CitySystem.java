package cs205.Lesson_06.Problem_02_SmallCities;

import java.util.Scanner;


public class CitySystem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      SmallCities smallCities = new SmallCities();

      smallCities.inputCities(scnr);
      smallCities.printCities();
   }
}