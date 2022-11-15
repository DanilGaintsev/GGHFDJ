package com.example.okapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private TextView loginLocked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Связываемся с элементами нашего интерфейса:
        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_password);
        login = (Button) findViewById(R.id.button_login);
        loginLocked = (TextView) findViewById(R.id.login_locked);

    }

    public void Login(View view) {
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(SignIn.this, second_activity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Неправильные данные!",Toast.LENGTH_SHORT).show();
            login.setEnabled(false);
            loginLocked.setVisibility(View.VISIBLE);
            loginLocked.setBackgroundColor(Color.RED);
            loginLocked.setText("Вход заблокирован!");
        }
    }

    public void GoToSignUp(View view) {
            Intent intent = new Intent(SignIn.this, MainActivity.class);
            startActivity(intent);
        }
}