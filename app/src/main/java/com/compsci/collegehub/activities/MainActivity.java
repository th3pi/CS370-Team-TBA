package com.compsci.collegehub.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.compsci.collegehub.R;

import models.Course;
import utils.CourseUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Course newCourse = new Course("CSCI370", "Fall2020", "CompSci", "Bon Sy");
        CourseUtils courseUtils = new CourseUtils();
        courseUtils.addCourse(newCourse);
    }
}