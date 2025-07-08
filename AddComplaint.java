package com.crimereportingapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddComplaint extends AppCompatActivity {

    private EditText complaintInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_complaint);

        complaintInput = findViewById(R.id.complaintInput);
    }

    public void submitComplaint(View view) {
        String complaint = complaintInput.getText().toString().trim();
        if (TextUtils.isEmpty(complaint)) {
            Toast.makeText(this, "Please enter a complaint", Toast.LENGTH_SHORT).show();
        } else {
            // Placeholder for Firebase push
            Toast.makeText(this, "Complaint submitted successfully", Toast.LENGTH_SHORT).show();
        }
    }
}
