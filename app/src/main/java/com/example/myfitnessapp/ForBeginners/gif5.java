package com.example.myfitnessapp.ForBeginners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myfitnessapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class gif5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif5);
    }
    public void clicknext5(View v) {
        Intent i = new Intent(this, gif6.class);
        startActivity(i);
    }
}

