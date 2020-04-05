package com.example.crisis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {


    private static final String USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void singup(View v){
        startActivity(new Intent(getApplicationContext(), regester  .class));

    }
    public void login(View v){
        TextView user = (TextView) findViewById(R.id.username);
        String username = user.getText().toString();
        Intent intent = new Intent(this, homevolunteer.class);
        intent.putExtra(homevolunteer.USERNAME, username);
        startActivity(intent);
    }
}
