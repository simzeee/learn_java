package cs205.Lesson_04.Problem_01_SortTypes;
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;

public class SortTypes {
  
   // Input 5 Integers and return the Integers in an ArrayList
   public static ArrayList<Integer> inputIntegers(Scanner scnr) {
      ArrayList<Integer> intArrayList = new ArrayList<Integer>();
      for (int i = 0; i < 5; i++) {
        intArrayList.add(scnr.nextInt());
    }
      return intArrayList;
   }

   // Input 5 Doubles and return the Doubles in an ArrayList
   public static ArrayList<Double> inputDoubles(Scanner scnr) {
       ArrayList<Double> doubleArrayList = new ArrayList<Double>();
      for (int i = 0; i < 5; i++) {
        doubleArrayList.add(scnr.nextDouble());
    }
      return doubleArrayList;
   }

   // Input 5 Strings, and return the Strings in an ArrayList
   public static ArrayList<String> inputWords(Scanner scnr) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
      for (int i = 0; i < 5; i++) {
        stringArrayList.add(scnr.next());
    }
      return stringArrayList;
   }

   // Output the elements of the ArrayList parameter
   public static <TheType extends Comparable<TheType>>
      void print(ArrayList<TheType> list) {
      int size = list.size();
      for(int i = 0; i < size; ++i){
         System.out.print(list.get(i) + " ");
      }
      System.out.println();
   }

   // Return the min, median, and max of the ArrayList parameter in a new ArrayList
   public static <TheType extends Comparable<TheType>>
      ArrayList<TheType> getStatistics(ArrayList<TheType> list)
   {
      ArrayList<TheType> copy = new ArrayList<TheType>(list);
      copy.sort(null);
      ArrayList<TheType> result = new ArrayList<TheType>();
      
      result.add(copy.get(0));
      result.add(copy.get(copy.size()/2));
      result.add(copy.get(copy.size()-1));
      // if(copy.size() % 2 == 0){

      // }
      return result;

   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Input a list of 5 Integers and print the ArrayList's statistics
      ArrayList<Integer> integers = inputIntegers(scnr);
      print(integers);
      ArrayList<Integer> integerStatistics = getStatistics(integers);
      print(integerStatistics);
      System.out.println();

      // Input a list of 5 Doubles and print the ArrayList's statistics
      ArrayList<Double> doubles = inputDoubles(scnr);
      print(doubles);
      ArrayList<Double> doubleStatistics = getStatistics(doubles);
      print(doubleStatistics);
      System.out.println();

      // Input a list of 5 words (Strings) and print the ArrayList's statistics
      ArrayList<String> words = inputWords(scnr);
      print(words);
      ArrayList<String> wordStatistics = getStatistics(words);
      print(wordStatistics);
   }
}
