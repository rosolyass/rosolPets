package com.example.rosolpets.screens;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rosolpets.R;

public class forgott extends AppCompatActivity {
    private EditText emailInput ;
    private TextView backToLogin ;
    private Button resetPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgott);
        emailInput = findViewById(R.id.emailInput);
        backToLogin = findViewById(R.id.backToLogin);
        resetPass = findViewById(R.id.resetPass);

       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
       //     Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
         //   v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
          //  return insets;
      //  });
    }
}