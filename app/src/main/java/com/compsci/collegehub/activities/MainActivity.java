package com.compsci.collegehub.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.compsci.collegehub.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.testfairy.TestFairy;

import java.util.ArrayList;

import models.Course;
import utils.CourseUtils;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Course> courses = new ArrayList<>();
    private CourseUtils courseUtils = new CourseUtils();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView courseCard = (CardView) findViewById(R.id.course_card);
        Intent coursePageIntent = new Intent(this, CoursePage.class);
        TestFairy.begin(this, "SDK-RdyibC2H");
        courseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(coursePageIntent);
            }
        });

    }
}