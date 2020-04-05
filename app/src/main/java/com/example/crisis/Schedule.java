package com.example.crisis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.crisis.data.scheduls_list;

public class Schedule extends AppCompatActivity {
    public static final String EXTRA_SID = "sid";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        int sid = (Integer) getIntent().getExtras().get(EXTRA_SID);
        scheduls_list Scheduls_list = scheduls_list.scheduls[sid];

        TextView date = (TextView) findViewById(R.id.date);
        date.setText(Scheduls_list.getDate());

    }
}
