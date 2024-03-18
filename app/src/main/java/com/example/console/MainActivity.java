package com.example.console;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEmailField;
    private EditText mPasswordField;
    private Button mLoginBtn, admin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        mEmailField = findViewById(R.id.email_field);
        mPasswordField = findViewById(R.id.password_field);
        mLoginBtn = findViewById(R.id.login_btn);
        admin = findViewById(R.id.login_admin);

        // Set onClickListener for the login button
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the LoginActivity
                Intent intent = new Intent(MainActivity.this, AcitivityLogin.class);
                startActivity(intent);
            }
        });

    }

    private void loginUser() {
        String email = mEmailField.getText().toString().trim();
        String password = mPasswordField.getText().toString().trim();

        // Check if email and password fields are empty
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Here, you can add your logic to authenticate the user using email and password
        // For simplicity, let's just display a toast message indicating successful login
        Toast.makeText(getApplicationContext(), "Login successful!", Toast.LENGTH_SHORT).show();

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the BookAppointmentActivity
                Intent intent = new Intent(MainActivity.this, BookAppointmentActivity.class);
                startActivity(intent);
            }
        });

    }
}