package cs205.lesson_6_11_b;

import java.util.Scanner;


public class CitySystem {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      SmallCities smallCities = new SmallCities();

      smallCities.inputCities(scnr);
      smallCities.printCities();
   }
}