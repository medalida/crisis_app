package com.example.crisis.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.crisis.MainActivity;
import com.example.crisis.R;

public class regester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);
    }
    public  void reges(View v)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
