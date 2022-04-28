package com.example.myfitnessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class BicepsSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps_slider);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        BicepsAdapter adapter = new BicepsAdapter(this);
        viewPager.setAdapter(adapter);
    }
}