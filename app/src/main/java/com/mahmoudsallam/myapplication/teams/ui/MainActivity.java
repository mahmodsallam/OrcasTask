package com.mahmoudsallam.myapplication.teams.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mahmoudsallam.myapplication.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeams();
    }

    public void displayTeams() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,
                TeamsFragment.newInstance()).commit();

    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }


}
