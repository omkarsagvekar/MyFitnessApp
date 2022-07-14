package com.example.myfitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myfitnessapp.activities.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;

public class SkipStep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip_step);
    }

    public void Click_by(View v) {
        Intent i = new Intent(this, SetStopwatch.class);
        startActivity(i);


    }

    public void Clickchest(View v) {
        Intent i = new Intent(this, ChestSlider.class);
        startActivity(i);

    }

    public void Clickshoulder(View v) {
        Intent i = new Intent(this, ShoulderSlider.class);
        startActivity(i);
    }

    public void clickbiceps(View v) {
        Intent i = new Intent(this, BicepsSlider.class);
        startActivity(i);
    }

    public void Clicktriceps(View v) {
        Intent i = new Intent(this, TricepSlider.class);
        startActivity(i);
    }

    public void Clickback(View v) {
        Intent i = new Intent(this, BackSlider.class);
        startActivity(i);
    }

    public void Clicklegs(View v) {
        Intent i = new Intent(this, LegSlider.class);
        startActivity(i);
    }

    public void clicklogout(View v) {
        Intent i = new Intent(this, LoginActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

}