package cs205.new_lesson_8;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String personName = "";
        int counter = 0;
        int youPosition = 0;

        Queue<String> peopleInQueue = new LinkedList<String>();

        personName = scnr.nextLine();
        while (!personName.equals("-1")) {

            if (!personName.equals("You")) {
                counter = counter + 1;
            } else {

                youPosition = counter + 1;
            }

            peopleInQueue.add(personName);
            personName = scnr.nextLine();
        }

        System.out.println("Welcome to the ticketing service... ");
        System.out.println("You are number " + youPosition + " in the queue.");

        counter = youPosition;
        for (int i = 0; i < youPosition; ++i) {

            String removedPerson = peopleInQueue.remove();

            counter = counter - 1;
            if (removedPerson.equals("You")) {
                System.out.print("You can now purchase your ticket!");
            } else {
                System.out.println(removedPerson + " has purchased a ticket.");
                System.out.print("You are now number " + counter);
            }
            System.out.println();
        }

    }
}
