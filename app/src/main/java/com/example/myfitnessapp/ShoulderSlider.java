package com.example.myfitnessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ShoulderSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_slider);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        ShoulderAdapter adapter = new ShoulderAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
