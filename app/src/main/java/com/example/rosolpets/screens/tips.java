package com.example.rosolpets.screens;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rosolpets.R;

public class tips extends AppCompatActivity {
    private EditText editTip;
    private Button btnAddImage;
    private Button btnTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tips);
        editTip = findViewById(R.id.editTip);
        btnAddImage = findViewById(R.id.btnAddImage);
        btnTip = findViewById(R.id.btnTip);

       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
           // Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
          //  v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
          //  return insets;
      //  });
    }
}