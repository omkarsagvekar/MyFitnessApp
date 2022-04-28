package com.example.myfitnessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class ChestSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_slider);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        ChestAdapter adapter = new ChestAdapter(this);
        viewPager.setAdapter(adapter);
    }


}
