package com.example.myfitnessapp.ForBeginners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myfitnessapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class gif4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif4);


    }

    public void clicknext4(View v) {
        Intent i = new Intent(this, gif5.class);
        startActivity(i);
    }
}