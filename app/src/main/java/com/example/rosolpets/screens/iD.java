package com.example.rosolpets.screens;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.rosolpets.R;

public class iD extends AppCompatActivity {
    private ImageView iv_camera_icon;
    private TextView tv_tab_services;
    private TextView tv_tab_tips;

    private TextView tv_profile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_id);
        iv_camera_icon = findViewById(R.id.iv_camera_icon);
        tv_profile = findViewById(R.id.tv_profile);
        tv_tab_tips = findViewById(R.id.tv_tab_tips);
        tv_tab_services = findViewById(R.id.tv_tab_services);
        tv_tab_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new android.content.Intent(iD.this, findSER.class));
            }
        });
        iv_camera_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new android.content.Intent(iD.this, relatible.class));
            }
        });


        tv_tab_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new android.content.Intent(iD.this, tips.class));
            }
        });

       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
          // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
           // return insets;
   //     });
    }

}