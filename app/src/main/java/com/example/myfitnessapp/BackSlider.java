package com.example.myfitnessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class BackSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_slider);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        BackAdapter adapter = new BackAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
