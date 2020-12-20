package models;

import java.util.HashMap;
import java.util.Map;

public class Course{
    private String name, semester, designation, instructorEmail;
    private Map<String, Object> gradableItems;

    public Course(String name, String semester, String designation, String instructorEmail) {
        this.name = name;
        this.semester = semester;
        this.designation = designation;
        this.instructorEmail = instructorEmail;
        this.gradableItems = new HashMap<>();
    }
    public Course(String name, String semester, String designation, String instructorEmail, Map<String, Object> gradableItems) {
        this.name = name;
        this.semester = semester;
        this.designation = designation;
        this.instructorEmail = instructorEmail;
        this.gradableItems = gradableItems;
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

    public Map<String, Object> getGradableItems() {
        return gradableItems;
    }

    public void setGradableItems(Map<String, Object> gradableItems) {
        this.gradableItems = gradableItems;
    }
}
