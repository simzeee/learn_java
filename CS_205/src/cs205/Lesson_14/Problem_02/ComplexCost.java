package cs205.Lesson_14.Problem_02;

import java.util.Scanner;

public class ComplexCost {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int passengerAge;
      int carryOns;
      int checkedBags;

      passengerAge = scnr.nextInt();
      carryOns = scnr.nextInt();
      checkedBags = scnr.nextInt();

      int airFare;

      if(passengerAge >= 60){
         airFare = 290;
      }
      else if (passengerAge <= 2) {
         airFare = 0;
      }
      else{
         airFare = 300;
      }

      if(carryOns > 0){
         airFare += 10;
      }

      if(checkedBags >= 2){
         airFare += 25 + ((checkedBags - 2) * 50);
      }

      System.out.println(airFare);
   }
}
