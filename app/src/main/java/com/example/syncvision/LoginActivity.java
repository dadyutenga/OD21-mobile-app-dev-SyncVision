package com.example.syncvision;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize views
        ivLogo = findViewById(R.id.iv_logo);
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);

        // Log for lifecycle methods
        Log.d("LoginActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LoginActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LoginActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LoginActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LoginActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LoginActivity", "onDestroy");
    }
}
