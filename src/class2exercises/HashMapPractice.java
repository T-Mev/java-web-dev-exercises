package class2exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newId = null;

        System.out.println("-Enter students-");

        do {
            System.out.print("Student ID: ");
            newId = input.nextInt();

            if (!newId.toString().equals("")){
                System.out.print("Student Name: ");
                String newStudent = input.nextLine();
                students.put(newId, newStudent);

                input.nextLine();
            }
        } while(!newId.toString().equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID Number: " + student.getKey() + " Name: " + student.getValue());
        }
    }
}
