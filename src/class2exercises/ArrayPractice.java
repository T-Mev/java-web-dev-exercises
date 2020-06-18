package class2exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,5,8};
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split("\\.");

        for (int i=0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                System.out.println(numbers[i]);
            }
        }

        System.out.println("\n" + Arrays.toString(sentenceArray));
    }
}
