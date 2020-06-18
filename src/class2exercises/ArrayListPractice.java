package class2exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(numbers, 1,2,3,4,5,6,7,8,9,10);
        Collections.addAll(words, "Tests","Have","Practice","Yes","Break","Oh","A", "They", "I","No");

        System.out.println("The sum of all even numbers of " + numbers + " is: "
                + ArrayListSum.calculateSum(numbers));

        System.out.println("\nEnter the word length to search for:");
        int wordLength = input.nextInt();

        input.close();

        System.out.println(wordLength + " word(s) found:\n" + ArrayListWordCount.getWord(wordLength,words));
    }
}
