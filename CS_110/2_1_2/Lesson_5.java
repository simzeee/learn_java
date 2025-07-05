import java.util.Scanner;

public class Lesson_5 {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputItem;
      int foodStock;

      inputItem = scnr.next();

      while(!inputItem.equals("Done")){
          foodStock = scnr.nextInt();
          
          if (foodStock < 40) {
                System.out.println(inputItem + ": low on stock");
            } else {
                System.out.println(inputItem + ": well stocked");
            }            
            inputItem = scnr.next();
      }
      scnr.close();
   }
}
