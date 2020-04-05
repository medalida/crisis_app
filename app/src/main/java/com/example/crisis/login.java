package com.example.crisis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void singup(View v){
        startActivity(new Intent(getApplicationContext(), regester.class));

    }
    public void login(View v){
        Intent intent = new Intent(this, homevolunteer.class);
        startActivity(intent);

    }
}
