package cs205.Lesson_06.Problem_03_PlantArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   public static void printArrayList(ArrayList<Plant> myGarden) {
      int idx = 1;
      for (Plant p : myGarden) {
         System.out.println("Plant " + idx + " Information: ");
         p.printInfo();           // Polymorphic call (Flower overrides printInfo)
         System.out.println();    // blank line between entries
         idx++;
      }
   }                                                    
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      ArrayList<Plant> myGarden = new ArrayList<Plant>();

      String plantName;
      int plantCost;

      String flowerName;
      int flowerCost;
      String colorOfFlowers;
      boolean isAnnual;

      

      input = scnr.next();
      while(!input.equals("-1")){
          if(input.equals("plant")){
            Plant inputPlant = new Plant();
            inputPlant.setPlantName(scnr.next());
            inputPlant.setPlantCost(scnr.next());
            myGarden.add(inputPlant);
          }
          else{
            Flower inputFlower = new Flower();            
            inputFlower.setPlantName(scnr.next());
            inputFlower.setPlantCost(scnr.next());            
            inputFlower.setPlantType(Boolean.parseBoolean(scnr.next()));
            inputFlower.setColorOfFlowers(scnr.next());
            myGarden.add(inputFlower);
          }
      
         input = scnr.next();
      }

      printArrayList(myGarden);
   }
}