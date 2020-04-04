package com.example.crisis;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class face extends AppCompatActivity {
    private home hm;
    private contact ct;
    private about ab;
private FrameLayout frame;
private BottomNavigationView navView;
private  FragmentTransaction f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);
        navView = findViewById(R.id.nav_view);
         frame=findViewById(R.id.contain);
        hm =new home();
        ct=new contact();
        ab=new about();

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        navView.setOnNavigationItemSelectedListener(navlisner);
        f=getSupportFragmentManager().beginTransaction();
        f.replace(R.id.contain, hm);
        f.commit();
    }
private  BottomNavigationView.OnNavigationItemSelectedListener navlisner=
        new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId())
                {
                    case R.id.home_bu:

                        f=getSupportFragmentManager().beginTransaction();
                        f.replace(R.id.contain, hm);
                        f.commit();
                        break;
                    case R.id.about_Bu:
                        f=getSupportFragmentManager().beginTransaction();
                        f.replace(R.id.contain, ab);
                        f.commit();
                        break;
                    case R.id.contact_bu:
                        f=getSupportFragmentManager().beginTransaction();
                        f.replace(R.id.contain, ct);
                        f.commit();
                        break;
                }

                return true;
            }
        };
}
