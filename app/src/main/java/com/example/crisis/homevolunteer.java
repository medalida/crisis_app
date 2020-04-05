package com.example.crisis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.crisis.data.scheduls_list;

import java.util.List;

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

        ArrayAdapter<scheduls_list> listAdapter = new ArrayAdapter<>(
                this,
                R.layout.listtext,
                scheduls_list.scheduls);
        ListView listSchedules = (ListView) findViewById(R.id.schedule);
        listSchedules.setAdapter(listAdapter);

        listSchedules.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                Intent intent = new Intent(homevolunteer.this, Schedule.class);
                intent.putExtra(Schedule.EXTRA_SID, (int) id);
                startActivity(intent);
            }
        });


    }


}
