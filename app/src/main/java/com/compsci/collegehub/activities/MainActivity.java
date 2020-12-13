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
    }
}