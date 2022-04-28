package com.example.myfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myfitnessapp.activities.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View v)
    {
        Intent i= new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "WELCOME", Toast.LENGTH_LONG).show();
    }
}