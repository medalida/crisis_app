package com.example.crisis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class homevolunteer extends AppCompatActivity {
    public static final String  USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homevolunteer);
        Intent intent = getIntent();
        String username = intent.getStringExtra(USERNAME);
        TextView volunteer_name = (TextView) findViewById(R.id.volunteer_name);
        volunteer_name.setText(username);


    }
}
