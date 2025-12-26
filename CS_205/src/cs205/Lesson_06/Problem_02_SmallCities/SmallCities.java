package cs205.Lesson_06.Problem_02_SmallCities;

import java.util.Scanner;
import java.util.ArrayList;

public class SmallCities {
   private ArrayList<City> cityList = new ArrayList<City>();

   public void inputCities(Scanner scnr){
             
       int lineNumber = scnr.nextInt();
       
       while(lineNumber != -1){
          City newCity = new City();
          newCity.readNameAndPopulation(scnr);
          cityList.add(newCity);
         lineNumber = scnr.nextInt();
      }
   }

   public void printCities() {
      City currCity;
      int i;

      for (i = 0; i < cityList.size(); ++i) {
         currCity = cityList.get(i);
         currCity.print();
      }
   }
}