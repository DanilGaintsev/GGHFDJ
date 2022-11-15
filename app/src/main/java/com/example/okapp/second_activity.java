package com.example.okapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class second_activity extends AppCompatActivity {
        private Button logout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        logout = (Button) findViewById(R.id.button_logout);
    }

    public void Logout(View view) {

        Toast.makeText(getApplicationContext(), "Выход из аккаунта удачный",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(second_activity.this,MainActivity.class);
        startActivity(intent);
    }
    public void GoToScroll(View view) {
        Intent intent = new Intent(second_activity.this, scroll.class);
        startActivity(intent);
    }
}

