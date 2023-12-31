package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdt, passEdt;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        userEdt = findViewById(R.id.editTextText);
        passEdt = findViewById(R.id.editTextPassword);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please fill the missing information", Toast.LENGTH_SHORT).show();
                } else if (userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this, "", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}