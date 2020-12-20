package com.example.coursepj;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;

public class Courseinfo {
    private static String instructor, email, website;
    static ArrayList<String> Schedule;
    static ArrayList<String> Resources;


    public Courseinfo(String instructor,String email, String website, ArrayList<String> Schedule, ArrayList<String> Resources) {
        this.instructor = instructor;
        this.email = email;
        this.website = website;
        this.Schedule = Schedule;
        this.Resources = Resources;
    }

    public static String getEmail() {
        return email;
    }
    public static String getWebsite() { return website; }

    public static String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

}

