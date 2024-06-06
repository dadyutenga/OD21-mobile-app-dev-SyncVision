package com.example.syncvision;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText etUsername, etEmail, etPhone, etPassword;
    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize views
        ivLogo = findViewById(R.id.iv_logo);
        etUsername = findViewById(R.id.et_username);
        etEmail = findViewById(R.id.et_email);
        etPhone = findViewById(R.id.et_phone);
        etPassword = findViewById(R.id.et_password);

        // Log for lifecycle methods
        Log.d("SignupActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SignupActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SignupActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SignupActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SignupActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SignupActivity", "onDestroy");
    }
}
