package utils;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import models.Professor;

public class ProfessorUtil {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    public void addProfessor(Professor professor){
        db.collection("professors").document(professor.getEmail()).set(professor).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d("SUCCESS", "Professor " + professor.getName() +" was successfully added to the database");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("ERROR", "Could not add professor", e);
            }
        });
    }
    public Task<DocumentSnapshot> getProfessor(String email){
        return db.collection("professors").document(email).get();
    }
}
