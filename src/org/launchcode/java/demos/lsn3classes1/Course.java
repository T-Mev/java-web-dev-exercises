package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;

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
}