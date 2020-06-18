package class2exercises;

import java.util.ArrayList;

public class ArrayListWordCount {
    public static ArrayList<String> getWord (int wordLength, ArrayList<String> wordArr){
        ArrayList<String> newList = new ArrayList<>();
        for (String word : wordArr){
            if (word.length() == wordLength){
                newList.add(word);
            }
        }
        return newList;
    }
}
