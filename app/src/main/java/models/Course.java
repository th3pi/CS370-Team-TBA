package models;

public class Course{
    private String name, semester, designation, instructorEmail;

    public Course(String name, String semester, String designation, String instructorEmail) {
        this.name = name;
        this.semester = semester;
        this.designation = designation;
        this.instructorEmail = instructorEmail;
    }
    public Course(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

}
