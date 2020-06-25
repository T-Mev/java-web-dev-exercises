package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student studentTed = new Student("Ted", 121121);
        studentTed.setNumberOfCredits(1);
        studentTed.setGpa(4.0);

        System.out.println("Student Name: " + studentTed.getName());
        System.out.println("Student ID: " + studentTed.getStudentId());
        System.out.println("Number of credits: " + studentTed.getNumberOfCredits());
        System.out.println("GPA: " + studentTed.getGpa());

    }
}
