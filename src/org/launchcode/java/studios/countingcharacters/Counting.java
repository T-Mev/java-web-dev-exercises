package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Map<Character, Integer> countedCharacters = new HashMap<>();
        int counter = 1;

//        String paragraph = "If the product of two terms is zero then " +
//                "common sense says at least one of the two terms has " +
//                "to be zero to start with. So if you move all the" +
//                " terms over to one side, you can put the quadratics" +
//                " into a form that can be factored allowing that side" +
//                " of the equation to equal zero. Once you’ve done that," +
//                " it’s pretty straightforward from there.";
//        char[] charInString = paragraph.toUpperCase().toCharArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to search through:");
        String searchTerm = input.nextLine();
        input.close();

        char[] charInString = searchTerm.toUpperCase().toCharArray();

        for (char eachChar : charInString){
            if (countedCharacters.containsKey(eachChar)){
                countedCharacters.put(eachChar,countedCharacters.get(eachChar) + counter);
            } else {
                countedCharacters.put(eachChar,counter);
            }
        }

        for (Map.Entry<Character, Integer> character : countedCharacters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}