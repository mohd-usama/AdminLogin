package com.usama.adminlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText name,password;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("admin") && password.getText().toString().equals("1234"))
                {
                    Toast.makeText(MainActivity.this, "Login SuccessFully", Toast.LENGTH_SHORT).show();

                    Intent intent1=new Intent(MainActivity.this,HomePage.class);
                    startActivity(intent1);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    //Toast.makeText(MainActivity.this, "Enter the password", Toast.LENGTH_SHORT).show();
                    password.setError("Enter the password");
                }
            }
        });

        }
    }
