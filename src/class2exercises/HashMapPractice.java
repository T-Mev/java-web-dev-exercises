package class2exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter students below:\n--------------------");

        do {
            System.out.print("Student's Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")){
                System.out.print("Student's ID Number: ");
                Integer newId = input.nextInt();
                students.put(newId, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\n[Class Roster]");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID Number: " + student.getKey() + " | Name: " + student.getValue());
        }
    }
}
