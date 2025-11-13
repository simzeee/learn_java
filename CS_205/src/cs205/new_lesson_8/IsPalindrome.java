package cs205.new_lesson_8;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int j;
        String line;
        boolean isPalindrome = true;

        line = scnr.nextLine();
        Deque<Character> palinDeque = new LinkedList<Character>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                palinDeque.add(c);
            }
        }
        while ((palinDeque.peekFirst() != null) && (palinDeque.peekLast() != null) && (palinDeque.size() > 1)) {

            if (palinDeque.removeFirst() != palinDeque.removeLast()) {
                isPalindrome = false;
                break;
            }

        }
        if (isPalindrome) {
            System.out.println("Yes, \"" + line + "\" is a palindrome.");
        } else {
            System.out.println("No, \"" + line + "\" is not a palindrome.");
        }

    }
}
