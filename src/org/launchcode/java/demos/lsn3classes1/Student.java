package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    double totalQualityScore = 0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        numberOfCredits +=  courseCredits;
        double qualityScore = grade * courseCredits;
        totalQualityScore += qualityScore;
        gpa = totalQualityScore / numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits >= 90){
            return "Senior";
        } else if (numberOfCredits >= 60){
            return "Junior";
        } else if (numberOfCredits >= 30){
            return "Sophomore";
        } else if (numberOfCredits >= 0) {
            return "Freshman";
        }
        return "[ERROR] Cannot have negative number of credits!";
    }

    public String getName() {
        return name;
    }

    private void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                ", totalQualityScore=" + totalQualityScore +
                '}';
    }
}