package com.example.myfitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SetStopwatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_stopwatch);
    }

    public void clickcount1(View v) {
        Intent i = new Intent(this, Stopwatch.class);
        startActivity(i);


    }
    public void clickcount2(View v) {
        Intent i = new Intent(this, Stopwatch.class);
        startActivity(i);
    }
    public void clickcount3(View v) {
        Intent i = new Intent(this, Stopwatch.class);
        startActivity(i);
    }

}
