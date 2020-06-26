package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String name;
    private String subject;
    private int yearsTeaching;

    public Teacher(String name, String subject, int yearsTeaching) {
        this.name = name;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getName() {
        return name;
    }

    private void setName(String aName) {
        this.name = aName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }
}
