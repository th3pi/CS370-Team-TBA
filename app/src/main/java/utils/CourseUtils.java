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

import java.util.HashMap;

import models.Course;

import static android.content.ContentValues.TAG;

public class CourseUtils {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public void addCourse(Course course){
        db.collection("courses").document(course.getName()).set(course).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("SUCCESS", "Course was successfully added");
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

    /**
     * Gets all courses from the database
     * @return Task<QuerySnapshot> object return. Requires implementation onSuccessListener
     */
    public Task<QuerySnapshot> getAllCourses(){
        return db.collection("courses").get();
    }

    /**
     * Adds a gradable item to course
     * @param course The course where the gradable item will be added
     * @param gradableItemName name of the gradable item
     * @param dueDate due date of the gradable item
     */
    public void addCourseGradable(Course course, String gradableItemName, String dueDate){
        if(course.getGradableItems() == null){
            course.setGradableItems(new HashMap<>());
        }
        course.getGradableItems().put(gradableItemName, dueDate);
        db.collection("courses").document(course.getName()).set(course).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("SUCCESS", "GradableItem was successfully added");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("ERROR", "Could not add GradableItem", e);
            }
        });
    }
}
