package org.launchcode.java.demos.lsn3classes1;

import java.util.List;

public class  Course {
    private String teacherName;
    private String subject;
    private List<String> classList;

    public Course(String teacherName, String subject, List<String> classList) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.classList = classList;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String aTeacherName) {
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

    public void setClassList(List<String> aClassList) {
        this.classList = aClassList;
    }
}