package cs205.Lesson_06.Problem_03_PlantArrayList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects   

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
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<Plant>();

      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String plantName;
      int plantCost;

      String flowerName;
      int flowerCost;
      String colorOfFlowers;
      boolean isAnnual;

      
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         //  String[] inputArray = input.split("\\r?\\n|\\r");          

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
      // TODO: Call the method printArrayList to print myGarden
   }
}