package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class  Course {
    private Teacher teacherName;
    private String subject;
    private List<String> classList = new ArrayList<String>();

    public Course(Teacher teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public Teacher getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(Teacher aTeacherName) {
        this.teacherName = aTeacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public List<String> getClassList() {
        return classList;
    }

    public void setClassList(String student) {
        classList.add(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return teacherName.equals(course.teacherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherName);
    }

    @Override
    public String toString() {
        return "Course{" +
                "teacherName=" + teacherName +
                ", subject='" + subject + '\'' +
                ", classList=" + classList +
                '}';
    }
}