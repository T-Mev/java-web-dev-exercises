package class2exercises;

import java.util.ArrayList;

public class ArrayListSum {
    public static int calculateSum (ArrayList<Integer> numberArr){
        int sum = 0;
        for (int number : numberArr){
            if (number % 2 == 0){
                sum += number;
            }
        }
        return sum;
    }
}
