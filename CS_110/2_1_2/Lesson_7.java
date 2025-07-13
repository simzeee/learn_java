import java.util.Scanner;

public class Lesson_7 {
  // shared Scanner for all input
    private static final Scanner scnr = new Scanner(System.in);

    /**
     * (2) Prints the MENU and returns a valid choice character.
     *     Keeps prompting until the user enters one of c, w, f, r, s, q.
     */
    public static char printMenu() {
         char choice;
    do {
        // 1 blank line before the menu
        System.out.println();

        System.out.println("MENU");
        System.out.println("c - Number of non-whitespace characters");
        System.out.println("w - Number of words");
        System.out.println("f - Find text");
        System.out.println("r - Replace all !'s");
        System.out.println("s - Shorten spaces");
        System.out.println("q - Quit");

        // 1 blank line after the Quit line
        System.out.println();

        // now print the prompt *with* a newline at the end
        System.out.println("Choose an option:");

        String line = scnr.nextLine();
        choice = (line.length() > 0) ? line.charAt(0) : '\0';
    } while ("cwfrsq".indexOf(choice) == -1);

    return choice;
    }

    /**
     * (3) Returns the count of all non-whitespace characters in text.
     */
    public static int getNumOfNonWSCharacters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    /**
     * (4) Returns the number of words in text.
     *     Splits on one-or-more whitespace so multiple spaces don’t overcount.
     */
    public static int getNumOfWords(String text) {
        String trimmed = text.trim();
        if (trimmed.isEmpty()) {
            return 0;
        }
        // split on any run of whitespace
        String[] words = trimmed.split("\\s+");
        return words.length;
    }

    /**
     * (5) Returns how many times toFind appears in text (non-overlapping).
     */
    public static int findText(String toFind, String text) {
        int count = 0;
        int idx = 0;
        while ((idx = text.indexOf(toFind, idx)) != -1) {
            count++;
            idx += toFind.length();
        }
        return count;
    }

    /**
     * (6) Returns a new string where every '!' is replaced by '.'.
     */
    public static String replaceExclamation(String text) {
        return text.replace('!', '.');
    }

    /**
     * (7) Returns a new string where every sequence of 2+ spaces is replaced by one space.
     */
    public static String shortenSpace(String text) {
        return text.replaceAll(" {2,}", " ");
    }

    public static void main(String[] args) {
              
          System.out.println("Enter a sample text:");
          System.out.println();  
          String text = scnr.nextLine();
          System.out.println("You entered: " + text);
          
        char option;
        // keep showing the menu until user picks 'q'
        do {
            option = printMenu();

            switch (option) {
                case 'c':
                    int nonWS = getNumOfNonWSCharacters(text);
                    System.out.println("Number of non-whitespace characters: " + nonWS);
                    break;

                case 'w':
                    int words = getNumOfWords(text);
                    System.out.println("Number of words: " + words);
                    break;

                case 'f':
                    System.out.println("Enter a word or phrase to be found:");
                    String toFind = scnr.nextLine();
                    int instances = findText(toFind, text);
                    System.out.println("\"" + toFind + "\" instances: " + instances);
                    break;

                case 'r':
                    text = replaceExclamation(text);
                    System.out.println("Edited text: " + text);
                    break;

                case 's':
                    text = shortenSpace(text);
                    System.out.println("Edited text: " + text);
                    break;

                case 'q':
                    // just exit
                    break;
            }

        } while (option != 'q');

        scnr.close();
    }
}