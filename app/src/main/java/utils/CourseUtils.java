package utils;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import models.Course;

public class CourseUtils {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public void addCourse(Course course){
        db.collection("courses").document(course.getName()).set(course).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("SUCCESS", "Course was successfully added with ID");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("ERROR", "Could not add college", e);
            }
        });
    }

    public DocumentReference getCourse(String name){
       return db.collection("courses").document(name);
    }

    public Task<QuerySnapshot> getAllCourses(){
        return db.collection("courses").get();
    }
}
