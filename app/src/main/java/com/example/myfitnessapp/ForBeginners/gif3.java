package com.example.myfitnessapp.ForBeginners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.myfitnessapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class gif3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif3);
    }

    public void clicknext3(View v) {
        Intent i = new Intent(this, gif4.class);
        startActivity(i);
    }
}