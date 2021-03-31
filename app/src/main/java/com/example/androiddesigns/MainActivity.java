package com.example.androiddesigns;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        getSupportFragmentManager().beginTransaction().replace(R.id.FLayout,new FHome()).commit();



        BottomNavigationView navigation = (BottomNavigationView)
                findViewById(R.id.BottomNevigation); navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener
            mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.FLayout,new FHome()).commit();

                    return true;
                case R.id.navigation_Alerts:

                    Toast.makeText(MainActivity.this, "Alert", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_Messages:

                    Toast.makeText(MainActivity.this, "Messages", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_Search:

                    Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_Profile:

                    Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                    return true;



            }

            return false;
        }

    };

   


}