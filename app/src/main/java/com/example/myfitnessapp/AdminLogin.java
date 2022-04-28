package com.example.myfitnessapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfitnessapp.activities.UsersListActivity;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLogin extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        Name =(EditText)findViewById(R.id.etName);
        Password =(EditText)findViewById(R.id.etPassword);
        Info =(TextView)findViewById(R.id.tvInfo);
        Login =(Button)findViewById(R.id.btn);

        Info.setText("No of Attempts Remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void validate(String userName, String userPassword){
        if ((userName.equals("Admin")) &&(userPassword.equals("1234"))){

            Intent intent= new Intent(AdminLogin.this, UsersListActivity.class);
            startActivity(intent);

        }else{
            counter--;

            Info.setText("No of attempts remaining:  "+String.valueOf(counter));

            if (counter == 0){
                Login.setEnabled(false);
            }



        }
    }
}






