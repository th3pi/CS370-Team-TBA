package com.compsci.collegehub.activities;

import android.os.Bundle;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.compsci.collegehub.R;
import com.google.firebase.firestore.DocumentSnapshot;

import models.Course;
import models.Professor;
import utils.CourseUtils;
import utils.ProfessorUtil;

public class CoursePage extends AppCompatActivity {
    private Course course;
    private Professor professor;
    private ProgressBar pBar;
    private CollapsingToolbarLayout toolBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setVisibility(View.INVISIBLE);
        pBar = findViewById(R.id.coursePageProgressBar);
        pBar.setVisibility(View.VISIBLE);
        initializeCourseDetails();
    }

    /**
     * Retrieves course details from Firestore
     */
    private void initializeCourseDetails(){
        new CourseUtils().getCourse("CSCI370").get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                course = documentSnapshot.toObject(Course.class);
                assert course != null; // Don't execute next lines if course object is null

                // Retrieve professor details from Firestore
                new ProfessorUtil().getProfessor(course.getInstructorEmail()).addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        professor = documentSnapshot.toObject(Professor.class);
                        assert course != null;
                        pBar.setVisibility(View.INVISIBLE);
                        toolBarLayout.setVisibility(View.VISIBLE);
                        toolBarLayout.setTitle(course.getName());
                        populateProfessorFields();
                    }
                });
            }
        });
    }

    /**
     * Populates professor details textviews
     */
    private void populateProfessorFields(){
        TextView profName = (TextView) findViewById(R.id.profName);
        TextView profEmail = (TextView) findViewById(R.id.profEmailText);
        TextView profWebsite = (TextView) findViewById(R.id.profWebText);

        profName.setText(professor.getName());
        profEmail.setText(professor.getEmail());
        profWebsite.setText(professor.getWebsite());
    }
}