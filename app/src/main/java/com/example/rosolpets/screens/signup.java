package com.example.rosolpets.screens;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rosolpets.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signup extends AppCompatActivity {

    private Button btnNext ;
    private EditText etUsername;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etBirthdate ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        btnNext = findViewById(R.id.btnNext);
        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etBirthdate = findViewById(R.id.etBirthdate);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String birthdate = etBirthdate.getText().toString();


                boolean valid = true;


                if (username.isEmpty() || !username.matches("[a-zA-Z0-9]+")) {
                    etUsername.setError("Username is required and must contain only letters and numbers");
                    valid = false;
                }

                if (email.isEmpty() || !email.contains("@")) {
                    etEmail.setError("Email is required and must contain @");
                    valid = false;
                }

                if (password.isEmpty() || password.length() < 6) {
                    etPassword.setError("Password is required and must contain at least 6 characters");
                    valid = false;
                }

                if (birthdate.isEmpty() || !birthdate.matches("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d")) {
                    etBirthdate.setError("Birthdate is required and must be in dd/mm/yyyy format");
                    valid = false;
                }

                if (valid) {
                    FirebaseAuth mAuth = FirebaseAuth.getInstance();
                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Log.d("SIGNUP", "createUserWithEmail:success");
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        startActivity(new Intent(signup.this, signinActivity.class));
                                    } else {
                                        Log.w("SIGNUP", "createUserWithEmail:failure", task.getException());
                                        Toast.makeText(signup.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }

        });
    }// why i
}// ts wrong: the method is not closed properly
