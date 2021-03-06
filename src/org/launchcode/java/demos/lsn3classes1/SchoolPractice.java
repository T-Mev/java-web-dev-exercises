package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student studentTed = new Student("Ted", 121121);
        studentTed.addGrade(3,4.0);
        studentTed.addGrade(4,3.0);

        Student studentBob = new Student("Bob", 123456);
        studentBob.addGrade(3,4.0);
        studentBob.addGrade(4,3.0);
        studentBob.addGrade(4,2.0);

        System.out.println("\nStudent Name: " + studentTed.getName());
        System.out.println("Student ID: " + studentTed.getStudentId());
        System.out.println("Number of credits: " + studentTed.getNumberOfCredits());
        System.out.println("GPA: " + studentTed.getGpa());
        System.out.println("Grade Level: " + studentTed.getGradeLevel());

        System.out.println("\nStudent Name: " + studentBob.getName());
        System.out.println("Student ID: " + studentBob.getStudentId());
        System.out.println("Number of credits: " + studentBob.getNumberOfCredits());
        System.out.println("GPA: " + studentBob.getGpa());
        System.out.println("Grade Level: " + studentBob.getGradeLevel());

        Teacher newTeacher = new Teacher("Mr. Teacher", "Math", 7);

        System.out.println("\nTeacher Name: " + newTeacher.getName());
        System.out.println("Teaching Subject: " + newTeacher.getSubject());
        System.out.println("Years Teaching: " + newTeacher.getYearsTeaching() + " year(s)");

        Course mathClass = new Course(newTeacher,"Algebra 101");
        mathClass.setClassList(studentTed.getName());
        mathClass.setClassList(studentBob.getName());

        System.out.println("\nCourse Instructor: " + mathClass.getTeacherName().getName());
        System.out.println("Course Subject: " + mathClass.getSubject());
        System.out.println("Class List: " + mathClass.getClassList());

    }
}
