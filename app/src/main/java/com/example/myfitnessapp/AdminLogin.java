package com.example.myfitnessapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfitnessapp.activities.UsersListActivity;
import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLogin extends AppCompatActivity {

    private TextInputEditText Name;
    private TextInputEditText Password;
    private TextView noOfAttempts;
    private Button Login;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        Name = findViewById(R.id.et_username);
        Password = findViewById(R.id.et_adminPassword);
        noOfAttempts =(TextView)findViewById(R.id.tvInfo);
        Login =(Button)findViewById(R.id.btn_adLogin);

        noOfAttempts.setText("No of Attempts Remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if ((userName.equals("admin")) &&(userPassword.equals("1234"))){

            Intent intent= new Intent(AdminLogin.this, UsersListActivity.class);
            startActivity(intent);

        }else{
            counter--;

            noOfAttempts.setText("No of attempts remaining:  "+String.valueOf(counter));

            if (counter == 0){
                Login.setEnabled(false);
            }

        }
    }
}






