package com.example.myfitnessapp.ForBeginners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myfitnessapp.R;
import com.example.myfitnessapp.SkipStep;

import androidx.appcompat.app.AppCompatActivity;

public class gif7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif7);
    }
    public void clicktohome(View v) {
        Intent i = new Intent(this, SkipStep.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
