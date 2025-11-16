package cs205.9_new_lesson;

import java.util.Scanner;

public class MileageTrackerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;

      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode();
      lastNode = headNode;

      // TODO: Scan the number of nodes
         i = scnr.nextInt();
      // TODO: For the scanned number of nodes, scan
      //       in data and insert into the linked list
      currNode = headNode;
         for(int j = 0; j < i; ++j){
            miles = scnr.nextDouble();
            date = scnr.next();
            lastNode = new MileageTrackerNode(miles, date);
            currNode.insertAfter(lastNode);      
            currNode = lastNode;      
         }

      // TODO: Call the printNodeData() method 
      //       to print the entire linked list
      currNode = headNode.getNext();
      while(currNode != null){
         currNode.printNodeData();
         currNode = currNode.getNext();
      }
            
   }
}