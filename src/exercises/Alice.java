package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing to do: once or" +
                " twice she had peeped into the book her sister was reading, but " +
                "it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?";

        Scanner input = new Scanner(System.in);

        System.out.println("▶ Enter a term to search for within the text of 'Alice’s Adventures in Wonderland':");
        String searchTerm = input.nextLine();
        input.close();

        boolean result = firstSentence.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println("▶ Was your search term found? : " + result);

        int termIndex = firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
        int termLength = searchTerm.length();

        if (result){
            System.out.println("▶ It was found at index [" + termIndex + "] and has a length of " + termLength + "." + "\n");
            System.out.println( "▶ Removed '" + searchTerm + "' from the sentence: " + "\n" +
                    firstSentence.toLowerCase().replace(searchTerm.toLowerCase(),"___"));
        } else {
            System.out.println("▶ Can't remove search term from sentence if not found.");
        }
    }
}
