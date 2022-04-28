package com.example.myfitnessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class TricepSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep_slider);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TricepAdapter adapter = new TricepAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
