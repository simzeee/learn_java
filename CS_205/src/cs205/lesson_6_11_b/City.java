package cs205.lesson_6_11_b;

import java.util.Scanner;
public class City {
   private String name;
   private int population;

	public void readNameAndPopulation(Scanner scnr) {
		name = scnr.next();
		population = scnr.nextInt();
	}

   public void print() {
      System.out.println("City: " + name + ", Population: " + population);
   }
}
